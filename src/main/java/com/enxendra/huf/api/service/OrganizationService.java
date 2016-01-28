package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.HUF;
import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class OrganizationService extends HUFService {

    private static final String SERVICE_PATH = "organizations";

    public OrganizationService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = HUF.getApiBase() + "/" + SERVICE_PATH;
    }

    public OrganizationResponse getOrganization(Map<String, Object> params, Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        OrganizationResponse organizationResponse = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        return organizationResponse;
    }

    public OrganizationResponse createOrganization(JsonObject body, RequestOptions requestOptions) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        OrganizationResponse organizationResponse = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        return organizationResponse;
    }

}
