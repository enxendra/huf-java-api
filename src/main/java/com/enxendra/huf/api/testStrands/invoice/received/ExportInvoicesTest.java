package com.enxendra.huf.api.testStrands.invoice.received;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.invoice.ExportResponse;
import com.enxendra.huf.api.service.ReceivedInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class ExportInvoicesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        ReceivedInvoiceService service = new ReceivedInvoiceService(requestOptions, new Long(27));

        try {
            Map<String, Object> params = new HashMap<String, Object>(0);

            params.put("export_format", "XLS");
            params.put("date_from", "2015-03-01");
            params.put("date_to", "2015-03-31");

            ExportResponse exportResponse = service.export(params);

            if (exportResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Export:" + exportResponse.getData().getExport());

            } else {
                System.out.println("No hay información de exportación");
            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
