package com.tinkoff.edu.app.services;

import com.tinkoff.edu.app.model.LoanResponse;
import com.tinkoff.edu.app.repositories.LoanCalcRepository;
import com.tinkoff.edu.app.model.LoanRequest;

public class LoanCalcService {
    LoanCalcRepository loanCalcRepository = new LoanCalcRepository();

    /**
     * TODO loan calculation
     * @return Response
     */
    public LoanResponse createRequest(LoanRequest request) {
        return loanCalcRepository.save(request);
    }
}
