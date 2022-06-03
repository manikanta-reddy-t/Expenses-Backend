package com.training.expensesapp.DTO;


import lombok.Data;

import java.util.List;

@Data
public class DashboardSheetSummaryDTO {
    private String sheetName;
    private Long cashin;
    private Long cashout;
    private Long balance;
    private List<Long> expenses;
    private List<DashboardPercentageDTO> dashboardPercentageDTOS;
}
