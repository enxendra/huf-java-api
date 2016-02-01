package com.enxendra.huf.api.test.invoice;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.enxendra.huf.api.service.InvoiceService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetInvoiceTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        InvoiceService service = new InvoiceService(requestOptions, new Long(27));

        try {
            InvoiceResponse invoiceResponse = service.getInvoice(new Long(484));

            if (invoiceResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(invoiceResponse.getData().getNumber());
                System.out.println(invoiceResponse.getData().getSeries());
                System.out.println(invoiceResponse.getData().getState());

            } else {
                System.out
                        .println("ERROR " + invoiceResponse.getErrorCode() + ": " + invoiceResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
