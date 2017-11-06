package com.acm.reconcile.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.RepositoryItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort.Direction;

import com.acm.reconcile.listener.JobCompletionNotificationListener;
import com.acm.reconcile.model.ReconcileResult;
import com.acm.reconcile.model.TransactionHistory;
import com.acm.reconcile.processor.TransactionItemProcessor;
import com.acm.reconcile.repository.TransactionHistoryRepository;
import com.acm.reconcile.writer.ReconcileResultItemWriter;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public DataSource dataSource;

	@Autowired
	private TransactionHistoryRepository transactionHistoryRepository;

	// tag::readerwriterprocessor[]

	@Bean
	public RepositoryItemReader<TransactionHistory> reader() {
		RepositoryItemReader<TransactionHistory> reader = new RepositoryItemReader<>();
		reader.setRepository(transactionHistoryRepository);
		reader.setMethodName("findAll");

		Map<String, Direction> sort = new HashMap<>();
		sort.put("paymentId", Direction.ASC);
		reader.setSort(sort);
		return reader;
	}

	@Bean
	public TransactionItemProcessor processor() {
		return new TransactionItemProcessor();
	}

	@Bean
	public ItemWriter<ReconcileResult> writer() {
		return new ReconcileResultItemWriter();
	}

	// end::readerwriterprocessor[]

	// tag::jobstep[]
	@Bean
	public Job importTxnJob(JobCompletionNotificationListener listener) {
		return jobBuilderFactory.get("importTxnJob").incrementer(new RunIdIncrementer()).listener(listener)
				.flow(step1()).end().build();
	}

	@Bean
	public Step step1() {
		return stepBuilderFactory.get("step1").<TransactionHistory, ReconcileResult>chunk(100).reader(reader())
				.processor(processor()).writer(writer()).build();
	}
	// end::jobstep[]
}
