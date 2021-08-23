package com.tinkoff.akimov1.Controllers;

import com.tinkoff.akimov1.Services.LoanCalcService;

public class LoanCalcController {
    /**
     * TODO Validates and logs request
     */
    public static int createRequest() {
        return LoanCalcService.createRequest();
    }
}
