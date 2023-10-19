package com.example.demo.ServiceImp;

import com.example.demo.Entity.Transaction;
import com.example.demo.Repository.TransactionRepo;
import com.example.demo.Service.TransactionService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepo transactionRepo;

    @Override
    public Transaction saveTransaction(final Transaction transaction){
        return transactionRepo.save(transaction);
    }

    @Override
    public Long numberOfTransactions(){
        return transactionRepo.count();
    }

    @Override
    public List<Transaction> findAllTransactions(){
        return transactionRepo.findAll();
    }
}