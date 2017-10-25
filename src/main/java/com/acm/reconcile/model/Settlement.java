package com.acm.reconcile.model;

import java.util.Date;

import com.acm.reconcile.model.type.Flag;
import com.acm.reconcile.model.type.TxnDesc;
import com.acm.reconcile.model.type.TxnType;

import lombok.Data;

@Data
public class Settlement {
	private String profileName;
	private Date transactionDate;
	private Double transactionAmount;
	private String transactionNarrative1;
	private String transactionNarrative2;
	private String transactionNarrative3;
	private String transactionNarrative4;
	private String transactionId;
	private TxnDesc transactionDescription;
	private TxnType transactionType;
	private String tmnId;
	private Date systemDate;
	private String pan;
	private String cardNo;
	private Flag flag;
}
