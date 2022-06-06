package com.training.expensesapp.Services;


import com.training.expensesapp.DTO.DayDTO;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class StatsService{
    public void stats(){
        Date date=Date.valueOf(LocalDate.now());
    }
}
