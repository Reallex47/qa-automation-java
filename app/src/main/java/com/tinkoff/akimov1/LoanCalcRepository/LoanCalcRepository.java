package com.tinkoff.akimov1.LoanCalcRepository;

public class LoanCalcRepository {
    private static int requestId;

    /**
     * TODO persists request
     * @return RequestId
     */
    public static int save() {
        return ++requestId;
    }
}
