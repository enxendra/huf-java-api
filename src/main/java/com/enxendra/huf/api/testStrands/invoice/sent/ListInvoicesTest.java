package com.enxendra.huf.api.testStrands.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.Invoice;
import com.enxendra.huf.api.model.invoice.InvoiceListResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class ListInvoicesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(999));

        Map<String, Object> params = new HashMap<String, Object>();

        /*params.put("order", "DESC");
        params.put("page", 1);
        params.put("page_size", 10);*/

        try {

            InvoiceListResponse invoiceListResponse = service.listInvoices(params);

            if (invoiceListResponse.getResponseCode().equals(Constants.OK)) {
                if (invoiceListResponse.getData() != null && invoiceListResponse.getData().getInvoices() != null
                        && invoiceListResponse.getData().getInvoices().size() > 0) {
                    for (Invoice invoice : invoiceListResponse.getData().getInvoices()) {
                        System.out.println(invoice.getId() + ". " + invoice.getNumber() + " - " + invoice.getSeries());
                    }
                } else {
                    System.out.println("Invoices not found");
                }

            } else {
                System.out.println("ERROR " + invoiceListResponse.getErrorCode() + ": "
                        + invoiceListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
