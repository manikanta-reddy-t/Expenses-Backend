package com.training.expensesapp.Repository;

import com.training.expensesapp.Models.Cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CashoutRepository extends JpaRepository<Cash, Long> {

    @Query("select count(cashInAndOut) from Cash where cashInAndOut=true")
    public Long getcashin();

}
