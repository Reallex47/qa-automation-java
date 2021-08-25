package com.tinkoff.edu.app.model;

import com.tinkoff.edu.app.types.ResponseType;

public class LoanResponse {
    private final ResponseType responseType;
    private final int requestId;
    public LoanResponse(ResponseType responseType, int requestId) {
        this.responseType = responseType;
        this.requestId = requestId;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public int getRequestId() {
        return requestId;
    }
}
