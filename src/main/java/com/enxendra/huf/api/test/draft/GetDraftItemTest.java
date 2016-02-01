package com.enxendra.huf.api.test.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftItemResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.test.ServiceTest;

public class GetDraftItemTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(27));

        try {
            DraftItemResponse draftItemResponse = service.getDraftItem(new Long(17028), new Long(1407));

            if (draftItemResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(draftItemResponse.getData().getDescription());
                System.out.println(draftItemResponse.getData().getPrice());
            } else {
                System.out.println("ERROR " + draftItemResponse.getErrorCode() + ": "
                        + draftItemResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
