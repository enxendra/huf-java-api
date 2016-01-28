package com.enxendra.huf.api.test;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationResponse;
import com.enxendra.huf.api.service.OrganizationService;

public class CreateOrganizationTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("poblation", "A Coruña");
        params.put("phone", "692977695");
        params.put("post_code", "15009");
        params.put("web_url", "www.test.com");
        params.put("country_code", "ESP");
        params.put("email", "drom.gom@gmail.com");
        params.put("address", "Padre Pita, 10");
        params.put("tax_number", "A85638778S");
        params.put("name", "Sopo Technologies, S.L.");
        params.put("province", "A Coruña");

        try {
            // Create new organization
            OrganizationResponse organizationResponse = service.createOrganization(params, requestOptions);

            if (organizationResponse.getData() != null) {
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
