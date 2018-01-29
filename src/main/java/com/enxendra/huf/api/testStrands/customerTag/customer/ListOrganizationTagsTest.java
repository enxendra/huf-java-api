package com.enxendra.huf.api.testStrands.customerTag.customer;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.*;
import com.enxendra.huf.api.service.CustomerTagsService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class ListOrganizationTagsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        CustomerTagsService service = new CustomerTagsService(requestOptions, new Long(999));

        try {

        OrganizationTagsListResponse organizationTagsListResponse = service.getOrganizationTags();

            if (organizationTagsListResponse.getResponseCode().equals(Constants.OK)) {
                if (organizationTagsListResponse.getData() != null && organizationTagsListResponse.getData().getTags() != null
                        && organizationTagsListResponse.getData().getTags().size() > 0) {
                    for (OrganizationTag tag : organizationTagsListResponse.getData().getTags()) {
                        System.out.println("TAG:   " + tag.getTag());
                        System.out.println("CUSTOMERLIST:    "+ tag.getCustomersId().toString());
                    }
                } else {
                    System.out.println("CustomerTags not found");
                }

            }
        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
