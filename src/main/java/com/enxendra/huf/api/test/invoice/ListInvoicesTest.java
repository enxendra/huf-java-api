package com.enxendra.huf.api.test.invoice;

import java.util.HashMap;
import java.util.Map;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.Invoice;
import com.enxendra.huf.api.model.invoice.InvoiceListResponse;
import com.enxendra.huf.api.service.InvoiceService;
import com.enxendra.huf.api.test.ServiceTest;

public class ListInvoicesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        InvoiceService service = new InvoiceService(requestOptions, new Long(27));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("sort_by", "invoice_number");
        params.put("order", "DESC");
        params.put("page", 1);
        params.put("page_size", 10);

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
