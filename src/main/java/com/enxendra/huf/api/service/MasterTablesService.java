package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.DeliveryMethodsResponse;
import com.enxendra.huf.api.model.mastertables.InvoiceStatesResponse;
import com.enxendra.huf.api.model.mastertables.PaymentMeansResponse;
import com.enxendra.huf.api.model.mastertables.RolesResponse;
import com.enxendra.huf.api.model.mastertables.TaxesResponse;
import com.enxendra.huf.api.model.mastertables.UnitsOfMeasureResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class MasterTablesService extends HUFService {

    private static final String SERVICE_PATH = "tables";

    public MasterTablesService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public RolesResponse listRoles() throws Exception {
        JsonObject jsonResponse = callService("/roles", RequestMethod.GET);
        RolesResponse rolesResponse = (new Gson()).fromJson(jsonResponse, RolesResponse.class);
        return rolesResponse;
    }

    public DeliveryMethodsResponse listDeliveryMethods() throws Exception {
        JsonObject jsonResponse = callService("/deliverymethods", RequestMethod.GET);
        DeliveryMethodsResponse deliveryMethodsResponse = (new Gson()).fromJson(jsonResponse,
                DeliveryMethodsResponse.class);
        return deliveryMethodsResponse;
    }

    public InvoiceStatesResponse listInvoiceStates() throws Exception {
        JsonObject jsonResponse = callService("/invoicestates", RequestMethod.GET);
        InvoiceStatesResponse invoiceStatesResponse = (new Gson()).fromJson(jsonResponse, InvoiceStatesResponse.class);
        return invoiceStatesResponse;
    }

    public PaymentMeansResponse listPaymentMeans() throws Exception {
        JsonObject jsonResponse = callService("/paymentmeans", RequestMethod.GET);
        PaymentMeansResponse paymentMeansResponse = (new Gson()).fromJson(jsonResponse, PaymentMeansResponse.class);
        return paymentMeansResponse;
    }

    public TaxesResponse listTaxes() throws Exception {
        JsonObject jsonResponse = callService("/taxes", RequestMethod.GET);
        TaxesResponse taxesResponse = (new Gson()).fromJson(jsonResponse, TaxesResponse.class);
        return taxesResponse;
    }

    public UnitsOfMeasureResponse listUnitsOfMeasure() throws Exception {
        JsonObject jsonResponse = callService("/unitsofmeasure", RequestMethod.GET);
        UnitsOfMeasureResponse unitsOfMeasureResponse = (new Gson()).fromJson(jsonResponse,
                UnitsOfMeasureResponse.class);
        return unitsOfMeasureResponse;
    }

}
