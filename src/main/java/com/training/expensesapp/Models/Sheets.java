package com.training.expensesapp.Models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Sheets {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sheetName;
    @OneToMany(mappedBy = "sheets")
    private List<Cash> cashList;
}
