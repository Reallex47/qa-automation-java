package com.tinkoff.edu.app.сontrollers;

import com.tinkoff.edu.app.model.LoanRequest;
import com.tinkoff.edu.app.model.LoanResponse;
import com.tinkoff.edu.app.services.LoanCalcService;

public final class LoanCalcController {
    LoanCalcService loanCalcService = new LoanCalcService();

    /**
     * TODO Validates and logs request
     * @return requestId
     */
    public LoanResponse createRequest(LoanRequest request) {
        return loanCalcService.createRequest(request);
    }
}
