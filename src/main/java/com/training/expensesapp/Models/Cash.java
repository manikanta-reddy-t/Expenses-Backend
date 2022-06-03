package com.training.expensesapp.Models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@Table(name = "cash")
public class Cash {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long amount;
    private String purpose;
    private Date date;
    private Time time;
    private String Category;
    private String paymentMode;
    private Boolean edited;
    private Boolean cashInAndOut; // cash in is true and cash out is false
    @ManyToOne
    @JoinColumn(name="sheetId", referencedColumnName ="id", insertable = false, updatable = false)
    private Sheets sheets;

}
