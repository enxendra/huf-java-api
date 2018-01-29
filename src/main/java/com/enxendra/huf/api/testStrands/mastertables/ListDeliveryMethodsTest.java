package com.enxendra.huf.api.testStrands.mastertables;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.mastertables.DeliveryMethodsResponse;
import com.enxendra.huf.api.service.MasterTablesService;
import com.enxendra.huf.api.testStrands.ServiceTest;

import java.util.Map.Entry;

public class ListDeliveryMethodsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        MasterTablesService service = new MasterTablesService(requestOptions);
        service.setConnectTimeOut(10000);
        service.setReadTimeOut(10000);

        try {
            DeliveryMethodsResponse deliveryMethodsResponse = service.listDeliveryMethods();

            if (deliveryMethodsResponse.getResponseCode().equals(Constants.OK)) {
                if (deliveryMethodsResponse.getData() != null
                        && deliveryMethodsResponse.getData().getDeliveryMethods() != null
                        && deliveryMethodsResponse.getData().getDeliveryMethods().size() != 0) {
                    System.out.println(deliveryMethodsResponse.getData().getDeliveryMethods().size()
                            + " deliveryMethods encontrados:");
                    for (Entry<String, String> entry : deliveryMethodsResponse.getData().getDeliveryMethods()
                            .entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue());
                    }
                }

            } else {
                System.out.println("ERROR " + deliveryMethodsResponse.getErrorCode() + ": "
                        + deliveryMethodsResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
