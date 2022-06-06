package com.training.expensesapp.DTO;

import lombok.Data;

import java.util.Date;

@Data
public class DayDTO {
    private Date date;
    private Long amount;
}
