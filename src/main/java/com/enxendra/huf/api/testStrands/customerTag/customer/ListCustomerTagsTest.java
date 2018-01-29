package com.enxendra.huf.api.testStrands.customerTag.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.*;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.service.CustomerTagsService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class ListCustomerTagsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerTagsService service = new CustomerTagsService(requestOptions, new Long(999));

        try {

            CustomerTagsListResponse customerTagsListResponse = service.listCustomerTags(new Long(182));

            if (customerTagsListResponse.getResponseCode().equals(Constants.OK)) {
                if (customerTagsListResponse.getData() != null && customerTagsListResponse.getData().getCustomer_tags() != null
                        && customerTagsListResponse.getData().getCustomer_tags().size() > 0) {
                    for (CustomerTag tag : customerTagsListResponse.getData().getCustomer_tags()) {
                        System.out.println("ID:   " + tag.getId());
                        System.out.println("DESCRIPCIÓN:    "+ tag.getDescription());
                        System.out.println("TAG:    " + tag.getTag());
                        System.out.println("CUSTOMER-ID:    "+ tag.getCustomer().getId());
                        System.out.println("CUSTOMER-NAME:    "+ tag.getCustomer().getName());
                    }
                } else {
                    System.out.println("CustomerTags not found");
                }

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
