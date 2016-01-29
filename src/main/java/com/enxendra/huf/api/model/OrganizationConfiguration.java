package com.enxendra.huf.api.model;

public class OrganizationConfiguration {

    private String currency;
    private String language;
    private String invoice_format;
    private String channel;
    private String bank_account;
    private String payment_deadline;
    private String pdf_template;
    private String primary_color;
    private String secondary_color;
    private String signature_delegate;

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

    public String getPaymentDeadline() {
        return payment_deadline;
    }

    public String getPdfTemplate() {
        return pdf_template;
    }

    public String getPrimaryColor() {
        return primary_color;
    }

    public String getSecondaryColor() {
        return secondary_color;
    }

    public String getSignatureDelegate() {
        return signature_delegate;
    }
}
