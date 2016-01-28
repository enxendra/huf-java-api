package com.enxendra.huf.api.test;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.service.OrganizationService;

public class SearchOrganizationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        Map<String, Object> params = new HashMap<String, Object>();

        try {

            // TODO
            // OrganizationResponse organizationResponse = service.searchOrganization(params, new
            // Long(359));
            //
            // if (organizationResponse.getData() != null) {
            // System.out.println(organizationResponse.getData().getPoblation());
            // System.out.println(organizationResponse.getData().getPhone());
            //
            // } else {
            // System.out.println("ERROR " + organizationResponse.getErrorCode() + ": "
            // + organizationResponse.getErrorMessage());
            // }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
