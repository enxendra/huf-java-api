package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.customer.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.Map;

public class CustomerTagsService extends HUFService {

    private static final String SERVICE_PATH = "tags";

    public CustomerTagsService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

    public CustomerTagResponse createCustomerTag(JsonObject body, Long cusId) throws HUFException {
        JsonObject jsonResponse = callService("/customer/"+ cusId, RequestMethod.POST, body);
        CustomerTagResponse response = (new Gson()).fromJson(jsonResponse, CustomerTagResponse.class);
        response.check();
        return response;
    }

    public CustomerTagResponse getCustomerTag(Long cusId, Long cusTagId) throws HUFException {
        JsonObject jsonResponse = callService("/customer/" + cusId + "/tag/" + cusTagId, RequestMethod.GET);
        CustomerTagResponse response = (new Gson()).fromJson(jsonResponse, CustomerTagResponse.class);
        response.check();
        return response;
    }

    public CustomerTagsListResponse listCustomerTags(Long cusId) throws HUFException {
        JsonObject jsonResponse = callService("/customer/"+ cusId, RequestMethod.GET);
        CustomerTagsListResponse response = (new Gson()).fromJson(jsonResponse, CustomerTagsListResponse.class);
        response.check();
        return response;
    }

    public CustomerTagResponse deleteCustomerTag(Long cusId, Long cusTagId) throws HUFException {
        JsonObject jsonResponse = callService("/customer/" + cusId + "/tag/" + cusTagId, RequestMethod.DELETE);
        CustomerTagResponse response = (new Gson()).fromJson(jsonResponse, CustomerTagResponse.class);
        response.check();
        return response;
    }

    public CustomerTagResponse updateCustomerTag(Long cusId, Long cusTagId, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/customer/" + cusId+"/tag/"+cusTagId, RequestMethod.PUT, body);
        CustomerTagResponse response = (new Gson()).fromJson(jsonResponse, CustomerTagResponse.class);
        response.check();
        return response;
    }

    public OrganizationTagsListResponse getOrganizationTags() throws HUFException {
        JsonObject jsonResponse = callService("/",RequestMethod.GET);
        OrganizationTagsListResponse response = (new Gson()).fromJson(jsonResponse, OrganizationTagsListResponse.class);
        response.check();
        return response;
    }



}
