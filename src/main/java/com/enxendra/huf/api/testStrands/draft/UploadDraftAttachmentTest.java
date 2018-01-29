package com.enxendra.huf.api.testStrands.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftAttachmentResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.testStrands.ServiceTest;
import com.google.gson.JsonObject;

public class UploadDraftAttachmentTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(999));

        JsonObject body = new JsonObject();

        body.addProperty(
                "content",
                "data");
        body.addProperty("mime", "image/jpeg");
        body.addProperty("name", "connection3.jpg");

        try {
            DraftAttachmentResponse draftAttachmentResponse = service.uploadDraftAttachment(body, new Long(1));

            if (draftAttachmentResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("The new draftAttachment has been uploaded!"
                        + draftAttachmentResponse.getData().getId());

            } else {
                System.out.println("ERROR " + draftAttachmentResponse.getErrorCode() + ": "
                        + draftAttachmentResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
