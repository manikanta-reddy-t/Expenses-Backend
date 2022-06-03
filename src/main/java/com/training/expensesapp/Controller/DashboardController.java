package com.training.expensesapp.Controller;


import com.training.expensesapp.DTO.CashoutDTO;
import com.training.expensesapp.Mappers.CashoutMapper;
import com.training.expensesapp.Models.Cash;
import com.training.expensesapp.Models.Sheets;
import com.training.expensesapp.Repository.CashoutRepository;
import com.training.expensesapp.Repository.SheetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private CashoutRepository cashoutRepository;
    @Autowired
    private SheetsRepository sheetsRepository;
    @Autowired
    private CashoutMapper cashoutMapper;

    @GetMapping("/sheetsname")
    public List<String> sheetNames(){

        return sheetsRepository.getListOfString();
    }
    @GetMapping("/expenses")
    public List<CashoutDTO> getExpenses(){
        return cashoutMapper.mapList(cashoutRepository.findAll());
    }

}
