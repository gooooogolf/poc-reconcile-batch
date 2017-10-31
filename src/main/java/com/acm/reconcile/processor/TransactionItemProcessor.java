package com.acm.reconcile.processor;

import org.springframework.batch.item.ItemProcessor;

import com.acm.reconcile.model.entity.PaymentTransaction;
import com.acm.reconcile.model.entity.TransactionHistory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionItemProcessor implements ItemProcessor<TransactionHistory, PaymentTransaction>{

	@Override
	public PaymentTransaction process(final TransactionHistory txnHistory) throws Exception {
		PaymentTransaction paymentTxn = new PaymentTransaction();
		paymentTxn.setCardNo(txnHistory.getCardNumber());
		paymentTxn.setFlag(null);
		paymentTxn.setPan(null);
		paymentTxn.setProfileName(null);
		paymentTxn.setSystemDate(null);
		paymentTxn.setTmnId(txnHistory.getTmnId());
		paymentTxn.setTransactionAmount(txnHistory.getTransactionAmount());
		paymentTxn.setTransactionDate(null);
		paymentTxn.setTransactionDescription(null);
		paymentTxn.setTransactionId(txnHistory.getPartnerTransactionId());
		paymentTxn.setTransactionNarrative1(null);
		paymentTxn.setTransactionNarrative2(null);
		paymentTxn.setTransactionNarrative3(null);
		paymentTxn.setTransactionNarrative4(null);
		paymentTxn.setTransactionType(null);
		
		log.info("[Txn History] TxnId: {}, Amount: {}", txnHistory.getPartnerTransactionId(), txnHistory.getTransactionAmount());
		return paymentTxn;
	}

}
