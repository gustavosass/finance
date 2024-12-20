package com.gustavosass.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavosass.finance.model.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
 
}
