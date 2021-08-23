package com.tinkoff.edu.services;

import com.tinkoff.edu.repositories.LoanCalcRepository;

public class LoanCalcService {
    /**
     * TODO Loan calculation
     */
    public static int createRequest() {
        return LoanCalcRepository.save();
    }
}
