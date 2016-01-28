package com.enxendra.huf.api.exception;

@SuppressWarnings("serial")
public class APIConnectionException extends HUFException {

    public APIConnectionException(String message) {
        super(message, null, 0);
    }

    public APIConnectionException(String message, Throwable e) {
        super(message, null, 0, e);
    }

}
