package com.enxendra.huf.api.test.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.enxendra.huf.api.service.SerieService;
import com.enxendra.huf.api.test.ServiceTest;

public class DeleteSerieTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        SerieService service = new SerieService(requestOptions);

        try {
            SerieResponse serieResponse = service.deleteSerie(new Long(359));

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