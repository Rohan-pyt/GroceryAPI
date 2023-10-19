package com.example.demo.Service;

import com.example.demo.Entity.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {
    Transaction saveTransaction(Transaction transaction);

    Long numberOfTransactions();

    List<Transaction> findAllTransactions();
}
