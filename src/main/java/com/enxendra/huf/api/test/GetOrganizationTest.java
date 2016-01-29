package com.enxendra.huf.api.test;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationResponse;
import com.enxendra.huf.api.service.OrganizationService;

public class GetOrganizationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            OrganizationResponse organizationResponse = service.getOrganization(new Long(363));

            if (organizationResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(organizationResponse.getData().getPoblation());
                System.out.println(organizationResponse.getData().getPhone());

            } else {
                System.out.println("ERROR " + organizationResponse.getErrorCode() + ": "
                        + organizationResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
