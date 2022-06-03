package com.training.expensesapp.Repository;

import com.training.expensesapp.Models.Sheets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SheetsRepository extends JpaRepository<Sheets,Long> {

    @Query("select sheetName from Sheets")
    public List<String> getListOfString();
}
