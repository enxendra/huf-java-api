package com.enxendra.huf.api.model.customer;

import com.enxendra.huf.api.model.HUFResponse;

public class CustomerTagsListResponse extends HUFResponse {

    public CustomerTagsList data;

    public CustomerTagsList getData() {
        return data;
    }

    public void setData(CustomerTagsList data) {
        this.data = data;
    }
}
