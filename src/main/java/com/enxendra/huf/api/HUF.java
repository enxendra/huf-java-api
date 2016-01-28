package com.enxendra.huf.api;

public abstract class HUF {

    public static volatile String apiKey;
    public static volatile String apiVersion;
    private static volatile String apiBase = Constants.API_STR_TEST;

    public static String getApiBase() {
        return apiBase;
    }

}
