package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class DeleteDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(27));

        try {
            DraftResponse draftResponse = service.deleteDraft(new Long(17030));

            if (!draftResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("ERROR " + draftResponse.getErrorCode() + ": " + draftResponse.getErrorMessage());
            } else {
                System.out.println("Deleted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
