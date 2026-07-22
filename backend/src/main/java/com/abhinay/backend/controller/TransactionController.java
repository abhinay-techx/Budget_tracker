package com.abhinay.backend.controller;

import com.abhinay.backend.model.Transaction;
import com.abhinay.backend.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction t) {
        return service.addTransaction(t);
    }

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }

    @GetMapping("/type/{type}")
    public List<Transaction> getByType(@PathVariable String type) {
        return service.getByType(type);
    }

    @GetMapping("/total-expense")
    public double totalExpense() {
        return service.getTotalExpense();
    }
}