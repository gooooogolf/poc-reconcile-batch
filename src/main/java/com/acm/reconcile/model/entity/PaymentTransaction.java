package com.acm.reconcile.model.entity;

import javax.persistence.Entity;

import com.acm.reconcile.model.Settlement;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class PaymentTransaction extends Settlement{
	private Double markoffAmount;
	private Double settlementAmount;
	private Double unsettlementAmount;
}
