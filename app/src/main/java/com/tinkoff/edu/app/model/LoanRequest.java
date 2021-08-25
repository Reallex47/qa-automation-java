package com.tinkoff.edu.app.model;

import com.tinkoff.edu.app.types.LoanType;

public class LoanRequest {
    private final int months; //stateful + immutable
    private final int amount;
    private final LoanType type;

    public LoanRequest(int months, int amount, LoanType type) {
        this.months = months;
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public int getMonths() {
        return months;
    }

    public LoanType getType() {
        return type;
    }

    public String toString() {
        return "Запрос от "
                + this.getType() + ": "
                + this.getAmount() + "$ на "
                + this.getMonths() + " месяцев";
    }
}
