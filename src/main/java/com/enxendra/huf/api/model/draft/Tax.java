package com.enxendra.huf.api.model.draft;

public class Tax {

    private String tax_base;
    private String tax_rate;
    private String tax_amount;
    private String tax_type;

    public String getTax_base() {
        return tax_base;
    }

    public String getTax_rate() {
        return tax_rate;
    }

    public String getTax_amount() {
        return tax_amount;
    }

    public String getTax_type() {
        return tax_type;
    }

    public void setTax_base(String tax_base) {
        this.tax_base = tax_base;
    }

    public void setTax_rate(String tax_rate) {
        this.tax_rate = tax_rate;
    }

    public void setTax_amount(String tax_amount) {
        this.tax_amount = tax_amount;
    }

    public void setTax_type(String tax_type) {
        this.tax_type = tax_type;
    }

}
