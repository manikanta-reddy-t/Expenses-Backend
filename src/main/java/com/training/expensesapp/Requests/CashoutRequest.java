package com.training.expensesapp.Requests;

import lombok.Data;

@Data
public class CashoutRequest {
    private Long id;
    private Long amount;
    private String purpose;
    private Boolean cashInAndOut; //cash in is true and cash out is false
    private String Category;
    private String paymentMode;
}
