package com.tinkoff.edu;

import com.tinkoff.edu.сontrollers.LoanCalcController;

/**
 * Loan Calc Tests
 */
public class LoanCalcTest {
    public static void main(String... args) {
        int requestId = LoanCalcController.createRequest();
        System.out.println(requestId + " Должно быть 1");
    }
}
