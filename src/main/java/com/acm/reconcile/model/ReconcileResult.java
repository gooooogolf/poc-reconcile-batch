package com.acm.reconcile.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "all_member_reconcile_result")
public class ReconcileResult {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Column(name = "uuid", updatable = false, nullable = false)
	private String uuid;

	@Column(name = "tmn_id")
	private String tmnId;

	@Column(name = "card_no")
	private String cardNo;

	@Column(name = "tmn_transaction_date")
	private Date tmnTransactionDate;

	@Column(name = "isv_transaction_date")
	private Date isvTransactionDate;

	@Column(name = "tmn_transaction_id")
	private String tmnTransactionId;

	@Column(name = "isv_transaction_id")
	private String isvTransactionId;

	@Column(name = "utiba_transaction_id")
	private String utibaTransactionId;

	@Column(name = "isv_name")
	private String isvName;

	@Column(name = "mcc_code")
	private String mccCode;

	@Column(name = "merchant_name")
	private String merchantName;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "country_name")
	private String countryName;

	@Column(name = "transaction_description")
	private String transactionDescription;

	@Column(name = "tmn_transaction_amount")
	private BigDecimal tmnTransactionAmount;

	@Column(name = "isv_transaction_amount")
	private BigDecimal isvTransactionAmount;

	@Column(name = "isv_settlement_transaction_amount")
	private BigDecimal isvSettlementTransactionAmount;

	@Column(name = "transaction_reconcile_status")
	private String transactionReconcileStatus;

	@Column(name = "settlement_status")
	private String settlementStatus;

	@Column(name = "settlement_date")
	private Date settlementDate;

	@Column(name = "ic_amount")
	private BigDecimal icAmount;

	@Column(name = "flag")
	private String flag;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "updated_at")
	private Date updatedAt;

}
