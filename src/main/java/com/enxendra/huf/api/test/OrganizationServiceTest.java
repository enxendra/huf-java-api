package com.enxendra.huf.api.test;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationResponse;
import com.enxendra.huf.api.service.OrganizationService;

public class OrganizationServiceTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        Map<String, Object> params = new HashMap<String, Object>();

        try {
            // Get organization with id 27
            OrganizationResponse organizationResponse = service.getOrganization(params, new Long(27));

            if (organizationResponse.getData() != null) {

                System.out.println(organizationResponse.getData());
                System.out.println(organizationResponse.getData().getPoblation());
                System.out.println(organizationResponse.getData().getId());

            } else {
                System.out.println("ERROR " + organizationResponse.getErrorCode() + ": "
                        + organizationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
