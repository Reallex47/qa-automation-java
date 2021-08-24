package com.tinkoff.edu.app;

import com.tinkoff.edu.app.model.LoanRequest;
import com.tinkoff.edu.app.types.LoanType;
import com.tinkoff.edu.app.сontrollers.LoanCalcController;
import com.tinkoff.edu.app.model.LoanResponse;

/**
 * Loan Calc Tests
 */
public class LoanCalcTest {
    public static void main(String... args) {
        LoanRequest request = new LoanRequest(10, 100, LoanType.IP);
        LoanResponse response = new LoanCalcController().createRequest(request);
        System.out.println("№ запроса: " + response.getRequestId());
        System.out.println(request);
        System.out.println("Статус: " + response.getResponseType());
    }
}
