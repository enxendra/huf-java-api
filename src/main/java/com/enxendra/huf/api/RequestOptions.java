package com.enxendra.huf.api;

public class RequestOptions {

    private String apiKey;

    public RequestOptions(String apiKey) {
        super();
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
