package com.acm.reconcile.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort.Direction;

import com.acm.reconcile.model.entity.TransactionHistory;
import com.acm.reconcile.repository.TransactionHistoryRepository;

@Configuration
@EnableBatchProcessing
public class ReconcileConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public TransactionHistoryRepository transactionHistoryRepository;

	@Bean
	public RepositoryItemReader<TransactionHistory> transactionHistoryReader() {
		RepositoryItemReader<TransactionHistory> reader = new RepositoryItemReader<>();
		reader.setRepository(transactionHistoryRepository);
		reader.setMethodName("findByOrderDate");

		List<Object> arguments = new ArrayList<>();
		arguments.add(new Date());
		reader.setArguments(arguments);

		Map<String, Direction> sort = new HashMap<>();
		sort.put("paymentId", Direction.ASC);
		reader.setSort(sort);

		return reader;
	}

}
