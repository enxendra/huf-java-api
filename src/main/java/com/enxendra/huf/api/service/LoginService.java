package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.user.LoginResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class LoginService extends HUFService {

    private static final String SERVICE_PATH = "login";

    public LoginService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public LoginResponse login(Map<String, Object> params) throws Exception {
        JsonObject jsonResponse = callService("", RequestMethod.GET, params);
        LoginResponse loginResponse = (new Gson()).fromJson(jsonResponse, LoginResponse.class);
        return loginResponse;
    }

}
