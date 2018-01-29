package com.enxendra.huf.api.testStrands.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetInvoiceAttachmentTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(999));

        try {
            InvoiceAttachmentResponse InvoiceAttachmentResponse = service.getInvoiceAttachment(new Long(1), new Long(
                    1));

            if (InvoiceAttachmentResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(InvoiceAttachmentResponse.getData().getMime());
                System.out.println(InvoiceAttachmentResponse.getData().getName());
                System.out.println(InvoiceAttachmentResponse.getData().getContent());

            } else {
                System.out.println("ERROR " + InvoiceAttachmentResponse.getErrorCode() + ": "
                        + InvoiceAttachmentResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
