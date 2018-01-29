package com.enxendra.huf.api.testStrands.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class DeleteDraftAttachmentTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(999));

        try {
            service.deleteDraftAttachment(new Long(1), new Long(1));
            System.out.println("Deleted!");

        } catch (HUFException e) {
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }

}
