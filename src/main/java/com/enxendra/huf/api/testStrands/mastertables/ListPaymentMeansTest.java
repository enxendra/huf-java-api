package com.enxendra.huf.api.testStrands.mastertables;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.PaymentMeansResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.Map.Entry;

public class ListPaymentMeansTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);

        try {
            PaymentMeansResponse paymentMeansResponse = service.listPaymentMeans();

            if (paymentMeansResponse.getResponseCode().equals(Constants.OK)) {
                if (paymentMeansResponse.getData() != null && paymentMeansResponse.getData().getPaymentMeans() != null
                        && paymentMeansResponse.getData().getPaymentMeans().size() != 0) {
                    System.out.println(paymentMeansResponse.getData().getPaymentMeans().size()
                            + " paymentMeans encontrados:");
                    for (Entry<String, String> entry : paymentMeansResponse.getData().getPaymentMeans().entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + paymentMeansResponse.getErrorCode() + ": "
                        + paymentMeansResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
