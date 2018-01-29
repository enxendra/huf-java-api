package com.enxendra.huf.api.testStrands.mastertables;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.RolesResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.Map.Entry;

public class ListRolesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);

        try {
            RolesResponse rolesResponse = service.listRoles();

            if (rolesResponse.getResponseCode().equals(Constants.OK)) {
                if (rolesResponse.getData() != null && rolesResponse.getData().getRoles() != null
                        && rolesResponse.getData().getRoles().size() != 0) {
                    System.out.println(rolesResponse.getData().getRoles().size() + " roles encontrados:");
                    for (Entry<String, String> entry : rolesResponse.getData().getRoles().entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + rolesResponse.getErrorCode() + ": " + rolesResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
