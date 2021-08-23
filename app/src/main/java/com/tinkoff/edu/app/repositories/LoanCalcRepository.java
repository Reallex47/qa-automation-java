package com.tinkoff.edu.app.repositories;

import com.tinkoff.edu.app.model.LoanRequest;
import com.tinkoff.edu.app.model.LoanResponse;
import com.tinkoff.edu.app.types.ResponseType;

public class LoanCalcRepository {
    private int requestId;

    /**
     * TODO insert request
     *
     * @return requestId
     */
    public LoanResponse save(LoanRequest request) {
        if (request.getMonths() > 1)
            return new LoanResponse(ResponseType.APPROVED, ++requestId);
        else
            return new LoanResponse(ResponseType.DECLINED, ++requestId);
    }
}
