package com.acm.reconcile.processor;

import org.springframework.batch.item.ItemProcessor;

import com.acm.reconcile.model.ReconcileResult;
import com.acm.reconcile.model.TransactionHistory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionItemProcessor implements ItemProcessor<TransactionHistory, ReconcileResult> {

	private static int txnNo = 1;

	@Override
	public ReconcileResult process(TransactionHistory item) throws Exception {
		log.info("Converting TransactionHistory to AllMemberReconcileResult. Number# {}", txnNo);
		txnNo++;

		ReconcileResult allMemberReconcileResult = new ReconcileResult();
		allMemberReconcileResult.setCardNo(item.getCardNumber());
		allMemberReconcileResult.setTmnId(item.getTmnId());
		allMemberReconcileResult.setTmnTransactionAmount(item.getTransactionAmount());
		allMemberReconcileResult.setTmnTransactionId(item.getPartnerTransactionId());

		return allMemberReconcileResult;
	}

}
