package com.enxendra.huf.api.testStrands.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.exception.HUFException;
import com.enxendra.huf.api.model.draft.DraftItemListResponse;
import com.enxendra.huf.api.model.draft.DraftItemResponse;
import com.enxendra.huf.api.model.draft.DraftItemsListResponse;
import com.enxendra.huf.api.model.shared.Item;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.testStrands.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CreateDraftItemList extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(999));
        List<Item> itemList = new ArrayList<Item>();
        JsonObject json = new JsonObject();
        JsonObject tempj = new JsonObject();
        JsonArray jArr = new JsonArray();


        Item draftItem = new Item();
        draftItem.setDescription("Test");
        draftItem.setQuantity("1.0");
        draftItem.setOrder("1");
        draftItem.setPrice("1.0");
        draftItem.setUnitOfMeasure("1");
        JsonParser parser = new JsonParser();

        itemList.add(draftItem);
        for (int i=0; i<2;i++){
            tempj = parser.parse((new Gson()).toJson(draftItem,Item.class)).getAsJsonObject();
            jArr.add(tempj);
        }


        try {
            DraftItemsListResponse draftItemResponse = service.createDraftItemList(jArr, new Long(104));

            if (draftItemResponse.getResponseCode().equals(Constants.CREATED_OR_UPDATED)) {
                for (Item item : draftItemResponse.getData())
                System.out.println("The new draftItem has the following id: " + item.getId());

            }

        } catch (HUFException e) {
            e.printStackTrace();
            System.out.println(" - Error - " + e.getCode() + ": " + e.getMessage());
        }
    }
}
