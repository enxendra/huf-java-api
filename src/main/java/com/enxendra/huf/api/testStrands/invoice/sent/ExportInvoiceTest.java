package com.enxendra.huf.api.testStrands.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.ExportFormat;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class ExportInvoiceTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(999));

        Map<String, Object> params = new HashMap<String, Object>();

        params.put("sort_by", "invoice_number");
        params.put("order", "DEST");
        params.put("export_format", ExportFormat.PDF);

        try {

            InvoiceResponse invoiceResponse = service.exportInvoices(params);

            if (invoiceResponse.getResponseCode().equals(Constants.OK)) {
                if (invoiceResponse.getData() != null) {
                    System.out.println(invoiceResponse.getData().getExport());

                } else {
                    System.out.println("Invoices not found");
                }

            } else {
                System.out
                        .println("ERROR " + invoiceResponse.getErrorCode() + ": " + invoiceResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
