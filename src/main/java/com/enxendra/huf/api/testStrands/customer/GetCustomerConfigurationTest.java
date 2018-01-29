package com.enxendra.huf.api.testStrands.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerConfigurationResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetCustomerConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(999));

        try {
            CustomerConfigurationResponse customerConfigurationResponse = service.getCustomerConfiguration(new Long(
                    1));

            if (customerConfigurationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(customerConfigurationResponse.getData().getInvoiceFormat());
                System.out.println(customerConfigurationResponse.getData().getCurrency());
                System.out.println(customerConfigurationResponse.getData().getChannel());

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
