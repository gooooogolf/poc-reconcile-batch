package com.acm.reconcile.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.acm.reconcile.model.TransactionHistory;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, String> {
	@Query("SELECT t FROM TransactionHistory t WHERE t.productCode = :productCode AND DATE(t.orderDate) = DATE(:orderDate)")
	public Page<TransactionHistory> searchByProductCodeAndOrderDate(@Param(value = "productCode") String productCode,
			@Param(value = "orderDate") Date orderDate, Pageable pageable);

	@Query("SELECT t FROM TransactionHistory t WHERE t.productCode = :productCode ")
	public Page<TransactionHistory> searchByProductCode(@Param(value = "productCode") String productCode,
			Pageable pageable);
}
