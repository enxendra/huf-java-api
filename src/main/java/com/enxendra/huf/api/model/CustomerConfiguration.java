package com.enxendra.huf.api.model;

public class CustomerConfiguration {

    private String currency;
    private String language;
    private String invoice_format;
    private String channel;
    private String bank_account;
    private Integer payment_deadline;
    private String pdf_template;

    public String getCurrency() {
        return currency;
    }

    public String getLanguage() {
        return language;
    }

    public String getInvoiceFormat() {
        return invoice_format;
    }

    public String getChannel() {
        return channel;
    }

    public String getBankAccount() {
        return bank_account;
    }

    public Integer getPaymentDeadline() {
        return payment_deadline;
    }

    public String getPdfTemplate() {
        return pdf_template;
    }
}
