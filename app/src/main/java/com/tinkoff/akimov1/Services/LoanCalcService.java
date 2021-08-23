package com.tinkoff.akimov1.Services;

import com.tinkoff.akimov1.Repositories.LoanCalcRepository;

public class LoanCalcService {
    /**
     * TODO Loan calculation
     */
    public static int createRequest() {
        return LoanCalcRepository.save();
    }
}
