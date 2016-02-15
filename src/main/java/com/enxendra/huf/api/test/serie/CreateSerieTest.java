package com.enxendra.huf.api.test.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.enxendra.huf.api.service.SerieService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class CreateSerieTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        SerieService service = new SerieService(requestOptions);

        JsonObject body = new JsonObject();

        body.addProperty("poblation", "A Coruña");
        body.addProperty("phone", "692977695");
        body.addProperty("post_code", "15009");
        body.addProperty("web_url", "www.test.com");
        body.addProperty("country_code", "ESP");
        body.addProperty("email", "drom.gom@gmail.com");
        body.addProperty("address", "Padre Pita, 10");
        body.addProperty("tax_number", "011038778S");
        body.addProperty("name", "Sopo Technologies, S.L.");
        body.addProperty("province", "A Coruña");

        try {
            SerieResponse serieResponse = service.createSerie(body);

            if (serieResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                System.out.println("The new serie has the following id: " + serieResponse.getData().getId());

            } else {
                System.out.println("ERROR " + serieResponse.getErrorCode() + ": " + serieResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
