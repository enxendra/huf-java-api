package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.serie.SerieListResponse;
import com.enxendra.huf.api.model.serie.SerieResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SerieService extends HUFService {

    private static final String SERVICE_PATH = "series";

    public SerieService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public SerieResponse getSerie(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        SerieResponse serieResponse = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        return serieResponse;
    }

    public SerieResponse createSerie(JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        SerieResponse serieResponse = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        return serieResponse;
    }

    public SerieResponse updateSerie(Long id, JsonObject body) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        SerieResponse serieResponse = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        return serieResponse;
    }

    public SerieResponse deleteSerie(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        SerieResponse serieResponse = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        return serieResponse;
    }

    public SerieListResponse listSeries() throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        SerieListResponse serieListResponse = (new Gson()).fromJson(jsonResponse, SerieListResponse.class);
        return serieListResponse;
    }

}
