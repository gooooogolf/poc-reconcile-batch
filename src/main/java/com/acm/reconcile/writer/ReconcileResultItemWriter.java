package com.acm.reconcile.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

import com.acm.reconcile.model.ReconcileResult;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReconcileResultItemWriter implements ItemWriter<ReconcileResult> {

	@Override
	public void write(List<? extends ReconcileResult> items) throws Exception {
		log.info("Received the information of {} results", items.size());
		items.forEach(i -> log.info("Write the information of a reconcile result: {}", i.getTmnTransactionId()));
	}

}
