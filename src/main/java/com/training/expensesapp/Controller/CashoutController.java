package com.training.expensesapp.Controller;


import com.training.expensesapp.Models.Cash;
import com.training.expensesapp.Repository.CashoutRepository;
import com.training.expensesapp.Requests.CashoutRequest;
import com.training.expensesapp.Services.CashoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/index")

public class CashoutController {


    @Autowired
    private CashoutRepository cashoutRepository;
    @Autowired
    private CashoutService cashoutService;


    @GetMapping
    public List<Cash> cashoutRead(){
        return cashoutRepository.findAll();
    }
    @PostMapping
    public Cash cashoutCreate(@RequestBody CashoutRequest cashOutRequest){
        cashoutService.cashoutPost(cashOutRequest);
        List<Cash> cash =cashoutRepository.findAll();
        return cash.get(cash.size()-1);
    }
    @PutMapping("/update")
    public void cashoutPut(@RequestBody CashoutRequest cashOutRequest){
        Long id=cashOutRequest.getId();
        cashoutService.cashoutUpdate(cashOutRequest,id);

    }
    @DeleteMapping("/delete/{id}")
    public void cashOutDelete(@PathVariable("id") Long id){
        cashoutRepository.deleteById(id);
    }
}
