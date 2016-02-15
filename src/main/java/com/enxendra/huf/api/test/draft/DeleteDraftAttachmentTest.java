package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftAttachmentResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class DeleteDraftAttachmentTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(27));

        try {
            DraftAttachmentResponse draftAttachmentResponse = service.deleteDraftAttachment(new Long(17028), new Long(
                    49));

            if (draftAttachmentResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Deleted!");
            } else {
                System.out.println("ERROR " + draftAttachmentResponse.getErrorCode() + ": "
                        + draftAttachmentResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
