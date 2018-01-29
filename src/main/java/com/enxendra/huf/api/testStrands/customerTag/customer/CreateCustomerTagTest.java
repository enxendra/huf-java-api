package com.enxendra.huf.api.testStrands.customerTag.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.enxendra.huf.api.model.customer.CustomerTagResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.service.CustomerTagsService;
import com.enxendra.huf.api.testStrands.ServiceTest;
import com.google.gson.JsonObject;

public class CreateCustomerTagTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerTagsService service = new CustomerTagsService(requestOptions, new Long(999));

        JsonObject body = new JsonObject();

        body.addProperty("tag", "PPPP");
        body.addProperty("description", "Prueba tag");

        try {
            CustomerTagResponse customerTagResponse = service.createCustomerTag(body,new Long((167)));

            if (customerTagResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new customerTag has the following id: " + customerTagResponse.getData().getId());
            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
