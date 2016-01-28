package com.enxendra.huf.api;

public abstract class HUF {

    private static volatile String apiBase = Constants.API_STR_TEST;

    public static String getApiBase() {
        return apiBase;
    }

}
