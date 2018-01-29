package com.enxendra.huf.api.model.customer;


import java.util.ArrayList;
import java.util.List;

public class OrganizationTag {

    private String tag;
    private List<String> customersId;


    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<String> getCustomersId() {
        return customersId;
    }

    public void setCustomersId(List<String> customersId) {
        this.customersId = customersId;
    }
}