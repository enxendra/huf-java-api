package com.enxendra.huf.api.testStrands.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetCustomerTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(999));

        try {
            CustomerResponse customerResponse = service.getCustomer(new Long(42));

            if (customerResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(customerResponse.getData().getPoblation());
                System.out.println(customerResponse.getData().getPhone());
                System.out.println(customerResponse.getData().getPostCode());

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
