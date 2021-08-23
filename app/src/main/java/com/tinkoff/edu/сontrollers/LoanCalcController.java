package com.tinkoff.edu.сontrollers;

import com.tinkoff.edu.services.LoanCalcService;

public class LoanCalcController {
    /**
     * TODO Validates and logs request
     */
    public static int createRequest() {
        return LoanCalcService.createRequest();
    }
}
