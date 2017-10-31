package com.acm.reconcile.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.acm.reconcile.model.entity.TransactionHistory;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, String> {
	public Page<TransactionHistory> findByOrderDate(Date orderDate, Pageable pageable);
}
