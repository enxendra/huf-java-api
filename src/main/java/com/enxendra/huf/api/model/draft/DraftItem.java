package com.enxendra.huf.api.model.draft;

import java.util.List;

public class DraftItem {

    public String order;
    public String description;
    public String quantity;
    public String unit_of_measure;
    public String price;
    public String total_cost;
    public String gross_amount;
    public String comments;
    public String article_code;
    public String delivery_note_number;
    public String delivery_note_date;
    public String transaction_date;
    public String period_start_date;
    public String period_end_date;
    public String contract_reference;
    public String transaction_reference;
    public String file_reference;
    public List<Discount> discounts;
    public List<Charge> charges;
    public List<Tax> taxes;

    public String getOrder() {
        return order;
    }

    public String getDescription() {
        return description;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getUnit_of_measure() {
        return unit_of_measure;
    }

    public String getPrice() {
        return price;
    }

    public String getTotal_cost() {
        return total_cost;
    }

    public String getGross_amount() {
        return gross_amount;
    }

    public String getComments() {
        return comments;
    }

    public String getArticle_code() {
        return article_code;
    }

    public String getDelivery_note_number() {
        return delivery_note_number;
    }

    public String getDelivery_note_date() {
        return delivery_note_date;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public String getPeriod_start_date() {
        return period_start_date;
    }

    public String getPeriod_end_date() {
        return period_end_date;
    }

    public String getContract_reference() {
        return contract_reference;
    }

    public String getTransaction_reference() {
        return transaction_reference;
    }

    public String getFile_reference() {
        return file_reference;
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

}
