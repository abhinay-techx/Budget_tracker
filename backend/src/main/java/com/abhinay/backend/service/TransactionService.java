package com.abhinay.backend.service;

import com.abhinay.backend.model.Transaction;
import com.abhinay.backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repo;

    public Transaction addTransaction(Transaction t) {
        return repo.save(t);
    }

    public List<Transaction> getAllTransactions() {
        return repo.findAll();
    }

    public List<Transaction> getByType(String type) {
        return repo.findByType(type);
    }

    public double getTotalExpense() {
        return repo.findAll()
                .stream()
                .filter(t -> t.getType().equalsIgnoreCase("EXPENSE"))
                .mapToDouble(Transaction::getAmount)
                .sum();
    }
}