package com.enxendra.huf.api.test;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationConfigurationResponse;
import com.enxendra.huf.api.service.OrganizationService;

public class GetOrganizationConfigurationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            OrganizationConfigurationResponse organizationConfigurationResponse = service
                    .getOrganizationConfiguration(new Long(359));

            if (organizationConfigurationResponse.getData() != null) {
                System.out.println(organizationConfigurationResponse.getData().getInvoiceFormat());
                System.out.println(organizationConfigurationResponse.getData().getCurrency());

            } else {
                System.out.println("ERROR " + organizationConfigurationResponse.getErrorCode() + ": "
                        + organizationConfigurationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
