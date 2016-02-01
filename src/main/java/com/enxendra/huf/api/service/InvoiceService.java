package com.enxendra.huf.api.service;

import java.util.Map;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentListResponse;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentResponse;
import com.enxendra.huf.api.model.invoice.InvoiceListResponse;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class InvoiceService extends HUFService {

    private static final String SERVICE_PATH = "invoices";

    public InvoiceService(RequestOptions requestOptions, Long orgId) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/organizations/" + orgId + "/" + SERVICE_PATH;
    }

    public InvoiceResponse getInvoice(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceResponse updateInvoiceState(Long id, JsonObject body, RequestOptions requestOptions) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceResponse deleteInvoice(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceListResponse listInvoices(Map<String, Object> params) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.GET, params);
        InvoiceListResponse invoiceListResponse = (new Gson()).fromJson(jsonResponse, InvoiceListResponse.class);
        return invoiceListResponse;
    }

    public InvoiceResponse acceptInvoice(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/accept", RequestMethod.PUT);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceResponse rejectInvoice(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/reject", RequestMethod.PUT);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceResponse getOriginal(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/original", RequestMethod.GET);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceResponse getPdf(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id + "/pdf", RequestMethod.GET);
        InvoiceResponse invoiceResponse = (new Gson()).fromJson(jsonResponse, InvoiceResponse.class);
        return invoiceResponse;
    }

    public InvoiceAttachmentListResponse listInvoiceAttachments(Long invoiceId) throws Exception {
        JsonObject jsonResponse = callService("/" + invoiceId + "/attachments", RequestMethod.GET);
        InvoiceAttachmentListResponse invoiceAttachmentListResponse = (new Gson()).fromJson(jsonResponse,
                InvoiceAttachmentListResponse.class);
        return invoiceAttachmentListResponse;
    }

    public InvoiceAttachmentResponse getInvoiceAttachment(Long invoiceId, Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + invoiceId + "/attachments/" + id, RequestMethod.GET);
        InvoiceAttachmentResponse invoiceAttachmentResponse = (new Gson()).fromJson(jsonResponse,
                InvoiceAttachmentResponse.class);
        return invoiceAttachmentResponse;
    }
}
