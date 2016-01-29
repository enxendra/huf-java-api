package com.enxendra.huf.api.test;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.CustomerConfigurationResponse;
import com.enxendra.huf.api.service.CustomerService;

public class GetCustomerConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        try {
            CustomerConfigurationResponse customerConfigurationResponse = service.getCustomerConfiguration(new Long(
                    1148));

            if (customerConfigurationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(customerConfigurationResponse.getData().getInvoiceFormat());
                System.out.println(customerConfigurationResponse.getData().getCurrency());

            } else {
                System.out.println("ERROR " + customerConfigurationResponse.getErrorCode() + ": "
                        + customerConfigurationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
