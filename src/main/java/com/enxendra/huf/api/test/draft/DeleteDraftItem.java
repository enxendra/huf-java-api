package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftItemResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class DeleteDraftItem extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST, USR_TOKEN);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(27));

        try {
            DraftItemResponse draftItemResponse = service.deleteDraftItem(new Long(17028), new Long(1407));

            if (draftItemResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("The item has been deleted");

            } else {
                System.out.println("ERROR " + draftItemResponse.getErrorCode() + ": "
                        + draftItemResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
