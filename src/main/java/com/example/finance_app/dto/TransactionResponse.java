package com.example.finance_app.dto;


import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class TransactionResponse {
    private Long id;
    private String accountNumber;
    private BigDecimal amount;
    private String currency;
    private String status;
    private LocalDateTime timestamp;


}
