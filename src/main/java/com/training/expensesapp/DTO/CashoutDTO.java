package com.training.expensesapp.DTO;


import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class CashoutDTO {
    private Long amount;
    private String purpose;
    private Date date;
    private Time time;
    private String Category;
    private String paymentMode;
    private Boolean edited;
    private Boolean cashInAndOut;
}
