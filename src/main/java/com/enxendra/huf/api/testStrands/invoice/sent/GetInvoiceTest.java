package com.enxendra.huf.api.testStrands.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetInvoiceTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(999));

        try {
            InvoiceResponse invoiceResponse = service.getInvoice(new Long(1));

            if (invoiceResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(invoiceResponse.getData().getNumber());
                System.out.println(invoiceResponse.getData().getSeries());
                System.out.println(invoiceResponse.getData().getState());
                System.out.println(invoiceResponse.getData().getReceiver().getContactPerson());

            } else {
                System.out
                        .println("ERROR " + invoiceResponse.getErrorCode() + ": " + invoiceResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
