package com.example.finance_app.service;

import com.example.finance_app.dto.TransactionRequest;
import com.example.finance_app.dto.TransactionResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class TransactionService {
    public TransactionResponse processTransaction(TransactionRequest request) {
        TransactionResponse response = new TransactionResponse();
        response.setId(System.currentTimeMillis());
        response.setAccountNumber(request.getAccountNumber());
        response.setAmount(request.getAmount());
        response.setCurrency(request.getCurrency());
        response.setStatus("PROCESSED");
        response.setTimestamp(java.time.LocalDateTime.now());
        return response;
    }

    public List<TransactionResponse> getTransacionsByAccountNumber(String accountNumber) {

        return List.of();
    }

    public Optional<TransactionResponse> getTransactionById(Long id) {
        return Optional.empty();
    }
}
