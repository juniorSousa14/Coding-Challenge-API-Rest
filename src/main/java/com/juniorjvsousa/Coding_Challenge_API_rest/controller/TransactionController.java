package com.juniorjvsousa.Coding_Challenge_API_rest.controller;


import com.juniorjvsousa.Coding_Challenge_API_rest.dto.TransactionRequest;
import com.juniorjvsousa.Coding_Challenge_API_rest.model.Transaction;
import com.juniorjvsousa.Coding_Challenge_API_rest.service.TrasactionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TrasactionService transactionService;

    public TransactionController(TrasactionService transactionService) {
        this.transactionService = transactionService;

    }

    @PostMapping
    public ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionRequest request) {
        if (request.getDataHora().isAfter(OffsetDateTime.now())) {
            return ResponseEntity.unprocessableEntity().build();
        }
        transactionService.addTransaction(new Transaction(request.getValor(), request.getDataHora()));
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        transactionService.clearTransactions();
        return ResponseEntity.ok().build();
    }


}
