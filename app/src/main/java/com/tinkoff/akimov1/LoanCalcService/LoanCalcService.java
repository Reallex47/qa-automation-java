package com.tinkoff.akimov1.LoanCalcService;

import com.tinkoff.akimov1.LoanCalcRepository.LoanCalcRepository;

public class LoanCalcService {
    /**
     * TODO Loan calculation
     */
    public static int createRequest() {
        return LoanCalcRepository.save();
    }
}
