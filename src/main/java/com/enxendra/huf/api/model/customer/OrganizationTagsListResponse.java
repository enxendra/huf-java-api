package com.enxendra.huf.api.model.customer;

import com.enxendra.huf.api.model.HUFResponse;

public class OrganizationTagsListResponse extends HUFResponse {

    public OrganizationTagsList data;

    public OrganizationTagsList getData() {
        return data;
    }

    public void setData(OrganizationTagsList data) {
        this.data = data;
    }
}
