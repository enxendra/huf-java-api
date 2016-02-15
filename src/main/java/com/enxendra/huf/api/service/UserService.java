package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.user.UserListResponse;
import com.enxendra.huf.api.model.user.UserResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class UserService extends HUFService {

    private static final String SERVICE_PATH = "users";

    public UserService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public UserResponse getUser(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        UserResponse userResponse = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        return userResponse;
    }

    public UserResponse createUser(JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        UserResponse userResponse = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        return userResponse;
    }

    public UserResponse updateUser(Long id, JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        UserResponse userResponse = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        return userResponse;
    }

    public UserResponse deleteUser(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        UserResponse userResponse = (new Gson()).fromJson(jsonResponse, UserResponse.class);
        return userResponse;
    }

    public UserListResponse listUsers() throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        UserListResponse userListResponse = (new Gson()).fromJson(jsonResponse, UserListResponse.class);
        return userListResponse;
    }

}
