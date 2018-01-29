package com.enxendra.huf.api.testStrands.login;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.user.LoginResponse;
import com.enxendra.huf.api.service.LoginService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class LoginTest extends ServiceTest {

    // The login service does not need USER_TOKEN (because it provides it as a response)
    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        LoginService service = new LoginService(requestOptions);

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("user_name", "eeeee@eeeee.com");
        params.put("pass", "eeeee");

        try {
            LoginResponse loginResponse = service.login(params);

            if (loginResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(loginResponse.getData().getUserName());
                System.out.println(loginResponse.getData().getUserToken());

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
