package com.acm.reconcile.model;

import java.util.Date;

import com.acm.reconcile.model.type.Status;
import com.acm.reconcile.model.type.TxnType;

import lombok.Data;
@Data
public class TransactionHistory {
	private String uuid;
	private Date orderDate;
	private String paymentId;
	private String chargeId;
	private String partnerTransactionId;
	private String bankTransactionId;
	private TxnType transactionType;
	private String productGroup;
	private String productType;
	private String productCode;
	private String productDetail;
	private String productRef1;
	private String productRef2;
	private Double transactionAmount;
	private String customerFee;
	private String sofType;
	private String emailAccount;
	private String mobileNumber;
	private String cardNumber;
	private String bankAccountNumber;
	private String sofRef1;
	private String sofRef2;
	private String sofRef3;
	private String sofRef4;
	private Status status;
	private Status reverseStatus;
	private String reverseRef;
	private Date reverseDate;
	private String channel;
	private String loginId;
	private String lastUpdated;
	private String metaData;
	private String traceId;
	private String refundId;
	private String isv;
	private String merchant;
	private String tmnId;
	private String remark;
}
