package com.acm.reconcile.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "transaction_history")
public class TransactionHistory {

	@Id
	@Column(name = "uuid", updatable = false, nullable = false)
	private String uuid;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "payment_id")
	private String paymentId;

	@Column(name = "charge_id")
	private String chargeId;

	@Column(name = "partner_transaction_id")
	private String partnerTransactionId;

	@Column(name = "bank_transaction_id")
	private String bankTransactionId;

	@Column(name = "transaction_type")
	private String transactionType;

	@Column(name = "product_group")
	private String productGroup;

	@Column(name = "product_type")
	private String productType;

	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_detail")
	private String productDetail;

	@Column(name = "product_ref1")
	private String productRef1;

	@Column(name = "product_ref2")
	private String productRef2;

	@Column(name = "transaction_amount")
	private BigDecimal transactionAmount;

	@Column(name = "customer_fee")
	private BigDecimal customerFee;

	@Column(name = "sof_type")
	private String sofType;

	@Column(name = "email_account")
	private String emailAccount;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "card_number")
	private String cardNumber;

	@Column(name = "bank_account_number")
	private String bankAccountNumber;

	@Column(name = "sof_ref1")
	private String sofRef1;

	@Column(name = "sof_ref2")
	private String sofRef2;

	@Column(name = "sof_ref3")
	private String sofRef3;

	@Column(name = "sof_ref4")
	private String sofRef4;

	@Column(name = "status")
	private String status;

	@Column(name = "reverse_status")
	private String reverseStatus;

	@Column(name = "reverse_ref")
	private String reverseRef;

	@Column(name = "reverse_date")
	private Date reverseDate;

	@Column(name = "channel")
	private String channel;

	@Column(name = "login_id")
	private String loginId;

	@Column(name = "last_updated")
	private Date lastUpdated;

	@Column(name = "metadata")
	private String metadata;

	@Column(name = "trace_id")
	private String traceId;

	@Column(name = "refund_id")
	private String refundId;

	@Column(name = "isv")
	private String isv;

	@Column(name = "merchant")
	private String merchant;

	@Column(name = "tmn_id")
	private String tmnId;

	@Column(name = "remark")
	private String remark;

	@Column(name = "response_code")
	private String responseCode;

	@Column(name = "response_message")
	private String responseMessage;

}
