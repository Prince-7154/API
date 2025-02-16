package com.example.sumservice;

import org.springframework.stereotype.Component;

@Component
public class SumRepository {

    public int calculateSum(int number1, int number2) {
        return number1 + number2;
    }
}
