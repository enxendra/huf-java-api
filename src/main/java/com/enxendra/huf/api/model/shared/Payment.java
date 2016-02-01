package com.enxendra.huf.api.model.shared;

public class Payment {

    private String payment_date;
    private String payment_method;
    private String amount;
    private String bank_account;

    public String getPayment_date() {
        return payment_date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public String getAmount() {
        return amount;
    }

    public String getBank_account() {
        return bank_account;
    }

}
