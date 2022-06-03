package com.training.expensesapp.DTO;

import lombok.Data;

@Data
public class DashboardSheetsDTO {
    private String sheetName;
    private Long cashin;
    private Long cashout;
    private Long balance;

}
