package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpensesContorller {

    @GetMapping("/expense")
    public String getExpenses(){
        return "Reading the Expenses from Database";
    }
}
