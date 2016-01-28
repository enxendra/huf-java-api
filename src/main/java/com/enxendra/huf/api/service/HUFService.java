package com.enxendra.huf.api.service;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class HUFService {

    protected RequestOptions requestOptions;
    protected String urlBase;

    public RequestOptions getRequestOptions() {
        return requestOptions;
    }

    public void setRequestOptions(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    protected JsonObject callService(String path, RequestMethod requestMethod) throws Exception {
        JsonReader reader;
        JsonParser parser = new JsonParser();
        URL url = new URL(this.urlBase + path);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

        urlConnection.setRequestProperty(Constants.CONTENT_TYPE, Constants.APP_JSON);
        urlConnection.setRequestProperty(Constants.AUTH, Constants.BASIC + " " + requestOptions.getApiKey());
        urlConnection.setRequestMethod(requestMethod.name());
        urlConnection.connect();

        try {
            reader = new JsonReader(new InputStreamReader(urlConnection.getInputStream()));
        } catch (IOException e) {
            reader = new JsonReader(new InputStreamReader(urlConnection.getErrorStream()));
        }

        JsonElement rootElement = parser.parse(reader);

        return rootElement.getAsJsonObject();

    }
}
