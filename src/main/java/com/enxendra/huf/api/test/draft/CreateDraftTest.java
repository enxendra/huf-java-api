package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;
import com.google.gson.JsonObject;

public class CreateDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(363));

        JsonObject body = new JsonObject();

        body.addProperty("cusId", "1145");

        try {
            DraftResponse draftResponse = service.createDraft(body, requestOptions);

            if (draftResponse.getResponseCode().equals(Constants.CREATED)) {
                System.out.println("The new draft has the following id: " + draftResponse.getData().getId());

            } else {
                System.out.println("ERROR " + draftResponse.getErrorCode() + ": " + draftResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
