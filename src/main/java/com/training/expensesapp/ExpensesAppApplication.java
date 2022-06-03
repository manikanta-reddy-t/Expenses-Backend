package com.training.expensesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class ExpensesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpensesAppApplication.class, args);
    }

}
