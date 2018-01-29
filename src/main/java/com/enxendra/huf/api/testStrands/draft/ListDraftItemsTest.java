package com.enxendra.huf.api.testStrands.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.DraftItemListResponse;
import com.enxendra.huf.api.model.shared.Item;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.testStrands.ServiceTest;

public class ListDraftItemsTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(999));

        try {

            DraftItemListResponse draftItemListResponse = service.listDraftItems(new Long(1));

            if (draftItemListResponse.getResponseCode().equals(Constants.OK)) {
                if (draftItemListResponse.getData() != null && draftItemListResponse.getData().getDraftItems() != null
                        && draftItemListResponse.getData().getDraftItems().size() > 0) {
                    for (Item draftItem : draftItemListResponse.getData().getDraftItems()) {
                        System.out.println(draftItem.getId() + ". " + draftItem.getDescription() + " - "
                                + draftItem.getPrice());
                    }
                } else {
                    System.out.println("Items not found");
                }

            } else {
                System.out.println("ERROR " + draftItemListResponse.getErrorCode() + ": "
                        + draftItemListResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
