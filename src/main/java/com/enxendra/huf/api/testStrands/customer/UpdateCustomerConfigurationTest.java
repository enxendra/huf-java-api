package com.enxendra.huf.api.testStrands.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.CustomerConfigurationResponse;
import com.enxendra.huf.api.service.CustomerService;
import com.enxendra.huf.api.testStrands.ServiceTest;
import com.google.gson.JsonObject;

public class UpdateCustomerConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerService service = new CustomerService(requestOptions, new Long(999));

        JsonObject body = new JsonObject();

        body.addProperty("payment_deadline", 0);
        body.addProperty("language", "es");
        body.addProperty("currency", "BTC");
        body.addProperty("primary_color", "#FFFFFF");
        body.addProperty("signature_delegated", true);
        body.addProperty("invoice_format", "Facturae32");
        body.addProperty("secondary_color", "#D4A190");
        body.addProperty("channel", "EMAIL");
        body.addProperty("bank_account", "");
        body.addProperty("pdf_template", "");

        try {
            CustomerConfigurationResponse customerConfigurationResponse = service.updateCustomerConfiguration(new Long(
                    1), body);

            if (customerConfigurationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("CustomerConfiguration updated");

            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
