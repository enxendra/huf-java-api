package com.enxendra.huf.api.testStrands.mastertables;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.InvoiceStatesResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.Map.Entry;

public class ListInvoiceStatesTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);

        try {
            InvoiceStatesResponse invoiceStatesResponse = service.listInvoiceStates();

            if (invoiceStatesResponse.getResponseCode().equals(Constants.OK)) {
                if (invoiceStatesResponse.getData() != null
                        && invoiceStatesResponse.getData().getInvoiceStates() != null
                        && invoiceStatesResponse.getData().getInvoiceStates().size() != 0) {
                    System.out.println(invoiceStatesResponse.getData().getInvoiceStates().size()
                            + " invoiceStates encontrados:");
                    for (Entry<String, String> entry : invoiceStatesResponse.getData().getInvoiceStates().entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + invoiceStatesResponse.getErrorCode() + ": "
                        + invoiceStatesResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
