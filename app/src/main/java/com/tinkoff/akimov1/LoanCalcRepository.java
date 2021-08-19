package com.tinkoff.akimov1;

public class LoanCalcRepository {
    private static int requestId;

    /**
     *TODO persists request
     * @return RequestId
     */
    public static int save() {
        return ++requestId;
    }
}