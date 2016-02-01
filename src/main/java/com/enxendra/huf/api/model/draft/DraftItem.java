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

    public void setOrder(String order) {
        this.order = order;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setUnit_of_measure(String unit_of_measure) {
        this.unit_of_measure = unit_of_measure;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTotal_cost(String total_cost) {
        this.total_cost = total_cost;
    }

    public void setGross_amount(String gross_amount) {
        this.gross_amount = gross_amount;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setArticle_code(String article_code) {
        this.article_code = article_code;
    }

    public void setDelivery_note_number(String delivery_note_number) {
        this.delivery_note_number = delivery_note_number;
    }

    public void setDelivery_note_date(String delivery_note_date) {
        this.delivery_note_date = delivery_note_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public void setPeriod_start_date(String period_start_date) {
        this.period_start_date = period_start_date;
    }

    public void setPeriod_end_date(String period_end_date) {
        this.period_end_date = period_end_date;
    }

    public void setContract_reference(String contract_reference) {
        this.contract_reference = contract_reference;
    }

    public void setTransaction_reference(String transaction_reference) {
        this.transaction_reference = transaction_reference;
    }

    public void setFile_reference(String file_reference) {
        this.file_reference = file_reference;
    }

    public void setDiscounts(List<Discount> discounts) {
        this.discounts = discounts;
    }

    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

}
