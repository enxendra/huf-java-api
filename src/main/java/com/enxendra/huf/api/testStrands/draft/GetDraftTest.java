package com.enxendra.huf.api.testStrands.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class GetDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(999));

        try {
            DraftResponse draftResponse = service.getDraft(new Long(241));

            if (draftResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println(draftResponse.getData().getNumber());
                System.out.println(draftResponse.getData().getReceiver_centres().get(0));
                System.out.println(draftResponse.getData().getSender_centres().get(0).getAddress());
                System.out.println(draftResponse.getData().getSeries());

            } else {
                System.out.println("ERROR " + draftResponse.getErrorCode() + ": " + draftResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
