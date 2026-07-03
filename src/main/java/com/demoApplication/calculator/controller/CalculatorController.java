package com.demoApplication.calculator.controller;

import  com.demoApplication.calculator.model.Calculator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController{

    @PostMapping("/add")
    public double add(@RequestBody Calculator calculator){
        return calculator.getNum1() + calculator.getNum2();
    }

    @PostMapping("/subtract")
    public double subtract(@RequestBody Calculator calculator){
        return calculator.getNum1() - calculator.getNum2();
    }

    @PostMapping("/multiply")
    public double multiply(@RequestBody Calculator calculator){
        return calculator.getNum1() * calculator.getNum2();
    }

    @PostMapping("/divide")
    public double divide(@RequestBody Calculator calculator){
        return calculator.getNum1() / calculator.getNum2();
    }
}
