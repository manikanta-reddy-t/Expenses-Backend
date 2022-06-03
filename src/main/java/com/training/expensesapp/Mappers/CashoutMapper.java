package com.training.expensesapp.Mappers;

import com.training.expensesapp.DTO.CashoutDTO;
import com.training.expensesapp.Models.Cash;
import com.training.expensesapp.Requests.CashoutRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CashoutMapper {
    Cash cashOutRequestToCashOut(CashoutRequest cashOutRequest);
    CashoutDTO map(Cash cash);
    List<CashoutDTO> mapList(List<Cash> cash);
    void updateCashOut(CashoutRequest cashOutRequest, @MappingTarget Cash cash);

}
