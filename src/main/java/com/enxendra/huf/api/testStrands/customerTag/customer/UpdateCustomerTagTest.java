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

public class UpdateCustomerTagTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerTagsService service = new CustomerTagsService(requestOptions, new Long(999));

        JsonObject body = new JsonObject();

        body.addProperty("tag", "PRUEBITA");
        body.addProperty("description", "Que si que si");

        try {
            CustomerTagResponse customerTagResponse = service.updateCustomerTag(new Long(167), new Long(63), body);

            if (customerTagResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("CustomerTag updated");

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
