package com.acm.reconcile.processor;

import org.springframework.batch.item.ItemProcessor;

import com.acm.reconcile.model.PaymentTransaction;
import com.acm.reconcile.model.Settlement;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class SettlementItemProcessor implements ItemProcessor<Settlement, PaymentTransaction> {
	
	@Override
	public PaymentTransaction process(Settlement settlement) throws Exception {
		PaymentTransaction paymentTxn = new PaymentTransaction();
		paymentTxn.setCardNo(settlement.getCardNo());
		paymentTxn.setFlag(settlement.getFlag());
		paymentTxn.setPan(settlement.getPan());
		paymentTxn.setProfileName(settlement.getProfileName());
		paymentTxn.setSystemDate(settlement.getSystemDate());
		paymentTxn.setTmnId(settlement.getTmnId());
//		paymentTxn.setTransactionAmount(settlement.getTransactionAmount());
		paymentTxn.setTransactionDate(settlement.getTransactionDate());
		paymentTxn.setTransactionDescription(settlement.getTransactionDescription());
		paymentTxn.setTransactionId(settlement.getTransactionId());
		paymentTxn.setTransactionNarrative1(settlement.getTransactionNarrative1());
		paymentTxn.setTransactionNarrative2(settlement.getTransactionNarrative2());
		paymentTxn.setTransactionNarrative3(settlement.getTransactionNarrative3());
		paymentTxn.setTransactionNarrative4(settlement.getTransactionNarrative4());
		paymentTxn.setTransactionType(settlement.getTransactionType());
		paymentTxn.setSettlementAmount(settlement.getTransactionAmount());
		
		log.info("[Settlement] TxnId: {}, Amount: {}", settlement.getTransactionId(), settlement.getTransactionAmount());
		return paymentTxn;
	}

}
