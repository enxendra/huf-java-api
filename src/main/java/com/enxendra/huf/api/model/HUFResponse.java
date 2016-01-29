package com.enxendra.huf.api.model;

public class HUFResponse {

    // Response attributes
    public String responseCode;
    public String responseMessage;

    // JsonObject attributes
    public String error_code;
    public String error_message;

    public String getErrorCode() {
        return error_code;
    }

    public String getErrorMessage() {
        return error_message;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

}
