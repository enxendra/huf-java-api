package com.enxendra.huf.api.test;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationResponse;
import com.enxendra.huf.api.service.OrganizationService;

public class DeleteOrganizationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        Map<String, Object> params = new HashMap<String, Object>();

        try {
            // Get organization with id 27
            OrganizationResponse organizationResponse = service.getOrganization(params, new Long(359));

            if (organizationResponse.getErrorMessage() != null) {
                System.out.println("ERROR " + organizationResponse.getErrorCode() + ": "
                        + organizationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
