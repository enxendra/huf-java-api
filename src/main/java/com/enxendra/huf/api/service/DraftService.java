package com.enxendra.huf.api.service;

import com.enxendra.huf.api.RequestMethod;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftListResponse;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class DraftService extends HUFService {

    private static final String SERVICE_PATH = "drafts";

    public DraftService(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
        this.urlBase = requestOptions.getApiBase() + "/" + SERVICE_PATH;
    }

    public DraftResponse getDraft(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.GET);
        DraftResponse draftResponse = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        return draftResponse;
    }

    public DraftResponse createDraft(JsonObject body, RequestOptions requestOptions) throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.POST, body);
        DraftResponse draftResponse = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        return draftResponse;
    }

    public DraftResponse updateDraft(Long id, JsonObject body, RequestOptions requestOptions) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.PUT, body);
        DraftResponse draftResponse = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        return draftResponse;
    }

    public DraftResponse deleteDraft(Long id) throws Exception {
        JsonObject jsonResponse = callService("/" + id, RequestMethod.DELETE);
        DraftResponse draftResponse = (new Gson()).fromJson(jsonResponse, DraftResponse.class);
        return draftResponse;
    }

    public DraftListResponse listDrafts() throws Exception {
        JsonObject jsonResponse = callService("/", RequestMethod.GET);
        DraftListResponse draftListResponse = (new Gson()).fromJson(jsonResponse, DraftListResponse.class);
        return draftListResponse;
    }

}
