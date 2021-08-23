package com.tinkoff.akimov1;

import com.tinkoff.akimov1.LoanCalcController.LoanCalcController;

/**
 * Loan Calc Tests
 */
public class LoanCalcTest {
    public static void main(String... args) {
        int requestId = LoanCalcController.createRequest();
        System.out.println(requestId + " Должно быть 1");
    }
}
