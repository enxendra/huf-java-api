package com.enxendra.huf.api.model;

public class OrganizationListResponse {

    public String error_code;
    public String error_message;
    public OrganizationList data;

    public String getErrorCode() {
        return error_code;
    }

    public String getErrorMessage() {
        return error_message;
    }

    public OrganizationList getData() {
        return data;
    }
}
