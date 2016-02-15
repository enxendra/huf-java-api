package com.enxendra.huf.api.test.invoice;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.invoice.InvoiceAttachmentResponse;
import com.enxendra.huf.api.service.InvoiceService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetInvoiceAttachmentTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        InvoiceService service = new InvoiceService(requestOptions, new Long(27));

        try {
            InvoiceAttachmentResponse InvoiceAttachmentResponse = service.getInvoiceAttachment(new Long(484), new Long(
                    49));

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
