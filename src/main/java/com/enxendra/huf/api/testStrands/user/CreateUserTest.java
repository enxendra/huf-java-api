package com.enxendra.huf.api.testStrands.user;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.user.User;
import com.enxendra.huf.api.model.user.UserResponse;
import com.enxendra.huf.api.service.UserService;
import com.enxendra.huf.api.testStrands.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CreateUserTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        UserService service = new UserService(requestOptions);

        JsonObject body = new JsonObject();

        User user = new User();
        user.setName("Bea Prueba3");
        user.setPassword("eeeee");
        user.setLogin("eeeee@eeeee.com");
        user.setEmail("eeeee@eeeee.com");

        JsonParser parser = new JsonParser();
        body = parser.parse((new Gson()).toJson(user, User.class)).getAsJsonObject();

        try {
            UserResponse userResponse = service.createUser(body);

            if (userResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new user has the following id: " + userResponse.getData().getId());

            } else {
                System.out.println("ERROR " + userResponse.getErrorCode() + ": " + userResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
