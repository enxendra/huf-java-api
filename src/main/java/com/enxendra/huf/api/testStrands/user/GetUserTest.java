package com.enxendra.huf.api.testStrands.user;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.user.UserResponse;
import com.enxendra.huf.api.service.UserService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetUserTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        UserService service = new UserService(requestOptions);

        try {
            UserResponse userResponse = service.getUser(new Long(41));

            if (userResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(userResponse.getData().getLogin());

            } else {
                System.out.println("ERROR " + userResponse.getErrorCode() + ": " + userResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
