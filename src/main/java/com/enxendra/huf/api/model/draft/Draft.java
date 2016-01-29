package com.enxendra.huf.api.model.draft;

import java.util.List;

public class Draft {

    public Long id;
    public String number;
    public String series;
    public String date;
    public String state;
    public String total_cost;
    public String gross_amount;
    public String total_to_pay;
    public String currency;
    public String comments;
    public Sender sender;
    public Receiver receiver;
    public List<DraftItem> items;
    public List<Payment> payments;
    public List<Discount> discounts;
    public List<Charge> charges;
    public List<Tax> taxes;
    public String exchange_rate;
    public String invoice_type;
    public String corrective_inv_number;
    public String corrective_inv_series;
    public String corrective_reason_code;
    public String corrective_reason_method;

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
        return series;
    }

    public String getDate() {
        return date;
    }

    public String getState() {
        return state;
    }

    public String getTotal_cost() {
        return total_cost;
    }

    public String getGross_amount() {
        return gross_amount;
    }

    public String getTotal_to_pay() {
        return total_to_pay;
    }

    public String getCurrency() {
        return currency;
    }

    public String getComments() {
        return comments;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public List<DraftItem> getItems() {
        return items;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public List<Discount> getDiscounts() {
        return discounts;
    }

    public List<Charge> getCharges() {
        return charges;
    }

    public List<Tax> getTaxes() {
        return taxes;
    }

    public String getExchange_rate() {
        return exchange_rate;
    }

    public String getInvoice_type() {
        return invoice_type;
    }

    public String getCorrective_inv_number() {
        return corrective_inv_number;
    }

    public String getCorrective_inv_series() {
        return corrective_inv_series;
    }

    public String getCorrective_reason_code() {
        return corrective_reason_code;
    }

    public String getCorrective_reason_method() {
        return corrective_reason_method;
    }

}
