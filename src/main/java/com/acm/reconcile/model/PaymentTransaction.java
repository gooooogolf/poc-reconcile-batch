package com.acm.reconcile.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@EqualsAndHashCode(callSuper=false)
public class PaymentTransaction extends Settlement{
	private Double markoffAmount;
	private Double settlementAmount;
	private Double unsettlementAmount;
}
