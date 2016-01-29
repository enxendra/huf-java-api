package com.enxendra.huf.api.test;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.Customer;
import com.enxendra.huf.api.model.CustomerListResponse;
import com.enxendra.huf.api.service.CustomerService;

public class ListCustomersTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(363));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("customer_name", "Diego");
        params.put("customer_tax_number", "A000");
        params.put("order", "DESC");
        params.put("page", 1);
        params.put("page_size", 10);

        try {

            CustomerListResponse customerListResponse = service.listCustomers(params);

            if (customerListResponse.getResponseCode().equals(Constants.OK)) {
                if (customerListResponse.getData() != null && customerListResponse.getData().getCustomers() != null
                        && customerListResponse.getData().getCustomers().size() > 0) {
                    for (Customer customer : customerListResponse.getData().getCustomers()) {
                        System.out.println(customer.getId() + ". " + customer.getName() + " - "
                                + customer.getTaxNumber());
                    }
                } else {
                    System.out.println("Customers not found");
                }

            } else {
                System.out.println("ERROR " + customerListResponse.getErrorCode() + ": "
                        + customerListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}