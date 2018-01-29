package com.enxendra.huf.api.testStrands.invoice.sent;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.invoice.TotalResponse;
import com.enxendra.huf.api.service.SentInvoiceService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.HashMap;
import java.util.Map;

public class TotalPaidTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        SentInvoiceService service = new SentInvoiceService(requestOptions, new Long(999));

        try {
            Map<String, Object> params = new HashMap<String, Object>(0);

            params.put("date_from", "2015-03-01");
            params.put("date_to", "2015-03-31");

            TotalResponse reponse = service.totalPaid(params);

            if (reponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Total:" + reponse.getData().getTotal());

            } else {
                System.out.println("No hay información de total");
            }

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
