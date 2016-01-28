package com.enxendra.huf.api.exception;

@SuppressWarnings("serial")
public abstract class HUFException extends Exception {

    private String requestId;
    private Integer code;

    public HUFException(String message, String requestId, Integer code) {
        super(message, null);
        this.requestId = requestId;
        this.code = code;
    }

    public HUFException(String message, String requestId, Integer code, Throwable e) {
        super(message, e);
        this.code = code;
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public Integer getCode() {
        return code;
    }
}
