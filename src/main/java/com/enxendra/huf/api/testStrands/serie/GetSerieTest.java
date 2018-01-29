package com.enxendra.huf.api.testStrands.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetSerieTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            SerieResponse serieResponse = service.getSerie(new Long(999), new Long(1));

            if (serieResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(serieResponse.getData().getCode());
                System.out.println(serieResponse.getData().getName());
                System.out.println(serieResponse.getData().getFillLeft());
                System.out.println(serieResponse.getData().getRebootYear());

            } else {
                System.out.println("ERROR " + serieResponse.getErrorCode() + ": " + serieResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
