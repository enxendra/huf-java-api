package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.customer.CustomerConfigurationResponse;
import com.enxendra.huf.api.model.customer.CustomerListResponse;
import com.enxendra.huf.api.model.customer.CustomerResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CustomerService extends HUFService {

    private static final String SERVICE_PATH = "customers";

    public CustomerService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

    public CustomerResponse getCustomer(Long customerId) throws Exception {
        JsonObject jsonResponse = callService("/" + customerId, RequestMethod.GET);
        CustomerResponse customerResponse = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        return customerResponse;
    }

    public CustomerResponse createCustomer(JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        CustomerResponse customerResponse = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        return customerResponse;
    }

    public CustomerResponse updateCustomer(Long id, JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        CustomerResponse customerResponse = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        return customerResponse;
    }

    public CustomerResponse deleteCustomer(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        CustomerResponse customerResponse = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        return customerResponse;
    }

    public CustomerListResponse listCustomers(Map<String, Object> params) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.GET, params);
        CustomerListResponse customerListResponse = (new Gson()).fromJson(jsonResponse, CustomerListResponse.class);
        return customerListResponse;
    }

    public CustomerResponse exportCustomers(Map<String, Object> params) throws Exception {
        JsonObject jsonResponse = callService("/export", RequestMethod.GET, params);
        CustomerResponse customerResponse = (new Gson()).fromJson(jsonResponse, CustomerResponse.class);
        return customerResponse;
    }

    public CustomerListResponse topCustomers(Map<String, Object> params) throws Exception {
        JsonObject jsonResponse = callService("/top", RequestMethod.GET, params);
        CustomerListResponse customerListResponse = (new Gson()).fromJson(jsonResponse, CustomerListResponse.class);
        return customerListResponse;
    }

    public CustomerConfigurationResponse getCustomerConfiguration(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.GET);
        CustomerConfigurationResponse customerConfigurationResponse = (new Gson()).fromJson(jsonResponse,
                CustomerConfigurationResponse.class);
        return customerConfigurationResponse;
    }

    public CustomerConfigurationResponse updateCustomerConfiguration(Long id, JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/configuration", RequestMethod.PUT, body);
        CustomerConfigurationResponse customerConfigurationResponse = (new Gson()).fromJson(jsonResponse,
                CustomerConfigurationResponse.class);
        return customerConfigurationResponse;
    }

}
