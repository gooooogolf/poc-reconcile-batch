package com.acm.reconcile.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.acm.reconcile.model.TransactionHistory;

public interface TransactionHistoryRepository extends PagingAndSortingRepository<TransactionHistory, String> {

}
