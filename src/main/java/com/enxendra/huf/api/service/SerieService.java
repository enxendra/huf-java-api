package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
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

    public SerieResponse getSerie(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieResponse createSerie(JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieResponse updateSerie(Long id, JsonObject body) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieResponse deleteSerie(Long id) throws HUFException {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        SerieResponse response = (new Gson()).fromJson(jsonResponse, SerieResponse.class);
        response.check();
        return response;
    }

    public SerieListResponse listSeries() throws HUFException {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        SerieListResponse response = (new Gson()).fromJson(jsonResponse, SerieListResponse.class);
        response.check();
        return response;
    }

}
