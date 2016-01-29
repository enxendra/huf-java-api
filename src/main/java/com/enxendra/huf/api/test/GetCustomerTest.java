package com.enxendra.huf.api.test;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.CustomerResponse;
import com.enxendra.huf.api.service.CustomerService;

public class GetCustomerTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        try {
            CustomerResponse customerResponse = service.getCustomer(new Long(1145));

            if (customerResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(customerResponse.getData().getPoblation());
                System.out.println(customerResponse.getData().getPhone());

            } else {
                System.out.println("ERROR " + customerResponse.getErrorCode() + ": "
                        + customerResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
