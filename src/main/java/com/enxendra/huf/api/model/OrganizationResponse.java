package com.enxendra.huf.api.model;

public class OrganizationResponse {

    public String error_code;
    public String error_message;
    public Organization data;

    public String getErrorCode() {
        return error_code;
    }

    public String getErrorMessage() {
        return error_message;
    }

    public Organization getData() {
        return data;
    }

    public void setData(Organization data) {
        this.data = data;
    }

}
