package com.training.expensesapp.Services;

import com.training.expensesapp.Mappers.CashoutMapper;
import com.training.expensesapp.Models.Cash;
import com.training.expensesapp.Repository.CashoutRepository;
import com.training.expensesapp.Requests.CashoutRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;

@Service

public class CashoutService {
    @Autowired
    private CashoutMapper cashoutMapper;

    @Autowired
    private CashoutRepository cashoutRepository;

    public void cashoutPost(CashoutRequest cashOutRequest) {
        Cash cash = cashoutMapper.cashOutRequestToCashOut(cashOutRequest);
        cashoutRepository.save(cash);
    }
    public void cashoutUpdate(CashoutRequest cashOutRequest, Long id){
        Cash cashout =cashoutRepository.findById(id).orElse(new Cash());
        cashoutMapper.updateCashOut(cashOutRequest, cashout);
        cashoutRepository.save(cashout);
    }
    public void cashoutDelete(Long id){
        cashoutRepository.deleteById(id);
    }
}
