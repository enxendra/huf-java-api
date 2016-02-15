package com.enxendra.huf.api.test.serie;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.enxendra.huf.api.service.SerieService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class UpdateSerieTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        SerieService service = new SerieService(requestOptions);

        JsonObject body = new JsonObject();

        body.addProperty("id", "A Coruña");
        body.addProperty("name", "666666666");
        body.addProperty("code", "15009");
        body.addProperty("prefix", "www.test.com");
        body.addProperty("suffix", "ESP");
        body.addProperty("fillLeft", "test@test.com");
        body.addProperty("numbering", "Padre Pita, 10");
        body.addProperty("defaultSeries", "0126038778S");
        body.addProperty("rebootYear", "Sopo Technologies, S.L.");
        body.addProperty("nextNumber", "A ");

        try {
            SerieResponse serieResponse = service.updateSerie(new Long(363), body);

            if (serieResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Serie updated");

            } else {
                System.out.println("ERROR " + serieResponse.getErrorCode() + ": " + serieResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
