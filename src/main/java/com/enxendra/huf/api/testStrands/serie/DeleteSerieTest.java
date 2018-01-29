package com.enxendra.huf.api.testStrands.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.enxendra.huf.api.service.OrganizationService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class DeleteSerieTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        OrganizationService service = new OrganizationService(requestOptions);

        try {
            SerieResponse serieResponse = service.deleteSerie(new Long(999), new Long(2));

            if (!serieResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("ERROR " + serieResponse.getErrorCode() + ": " + serieResponse.getErrorMessage());
            } else {
                System.out.println("Deleted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
