package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.OrganizationConfigurationResponse;
import com.enxendra.huf.api.model.OrganizationListResponse;
import com.enxendra.huf.api.model.OrganizationResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class OrganizationService extends HUFService {

    private static final String SERVICE_PATH = "organizations";

    public OrganizationService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public OrganizationResponse getOrganization(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        OrganizationResponse organizationResponse = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        return organizationResponse;
    }

    public OrganizationResponse createOrganization(JsonObject body, RequestOptions requestOptions) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        OrganizationResponse organizationResponse = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        return organizationResponse;
    }

    public OrganizationResponse updateOrganization(Long id, JsonObject body, RequestOptions requestOptions)
            throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        OrganizationResponse organizationResponse = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        return organizationResponse;
    }

    public OrganizationResponse deleteOrganization(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        OrganizationResponse organizationResponse = (new Gson()).fromJson(jsonResponse, OrganizationResponse.class);
        return organizationResponse;
    }

    public OrganizationListResponse listOrganizations() throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        OrganizationListResponse organizationListResponse = (new Gson()).fromJson(jsonResponse,
                OrganizationListResponse.class);
        return organizationListResponse;
    }

    public OrganizationConfigurationResponse getOrganizationConfiguration(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.GET);
        OrganizationConfigurationResponse organizationConfigurationResponse = (new Gson()).fromJson(jsonResponse,
                OrganizationConfigurationResponse.class);
        return organizationConfigurationResponse;
    }

    public OrganizationConfigurationResponse updateOrganizationConfiguration(Long id, JsonObject body,
            RequestOptions requestOptions) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.PUT, body);
        OrganizationConfigurationResponse organizationConfigurationResponse = (new Gson()).fromJson(jsonResponse,
                OrganizationConfigurationResponse.class);
        return organizationConfigurationResponse;
    }

}
