package com.enxendra.huf.api.testStrands.customerTag.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.service.CustomerTagsService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class DeleteCustomerTagTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerTagsService service = new CustomerTagsService(requestOptions, new Long(363));

        try {
            service.deleteCustomerTag(new Long (167), new Long(63));
            System.out.println("Deleted!");
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
