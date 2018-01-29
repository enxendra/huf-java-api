package com.enxendra.huf.api.testStrands.customerTag.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.enxendra.huf.api.model.customer.CustomerTagResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.service.CustomerTagsService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetCustomertagTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerTagsService service = new CustomerTagsService(requestOptions, new Long(999));

        try {
            CustomerTagResponse customerTagResponse= service.getCustomerTag(new Long(167),new Long(63));

            if (customerTagResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(customerTagResponse.getData().getTag());
                System.out.println(customerTagResponse.getData().getDescription());
                System.out.println(customerTagResponse.getData().getId());
                System.out.println(customerTagResponse.getData().getCustomer().getName());

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
