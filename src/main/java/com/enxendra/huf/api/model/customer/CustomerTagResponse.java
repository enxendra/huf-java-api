package com.enxendra.huf.api.model.customer;

import com.enxendra.huf.api.model.HUFResponse;

public class CustomerTagResponse extends HUFResponse {

    private CustomerTag data;

    public CustomerTag getData() {
        return data;
    }

    public void setData(CustomerTag data) {
        this.data = data;
    }

}
