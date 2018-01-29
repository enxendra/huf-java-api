package com.enxendra.huf.api.testStrands.draft;

import com.enxendra.huf.api.Constants;
import com.enxendra.huf.api.RequestOptions;
import com.enxendra.huf.api.model.draft.Centre;
import com.enxendra.huf.api.model.draft.Draft;
import com.enxendra.huf.api.model.draft.DraftResponse;
import com.enxendra.huf.api.service.DraftService;
import com.enxendra.huf.api.testStrands.ServiceTest;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.*;


public class UpdateDraftTest extends ServiceTest {

    static RequestOptions requestOptions = new RequestOptions(API_KEY, Constants.API_STR_TEST);

    public static void main(String[] args) {
        DraftService service = new DraftService(requestOptions, new Long(999));

        JsonObject body = new JsonObject();

        Draft draft = new Draft();
        draft.setNumber("111111");
        draft.setDate("2013-07-18");
        draft.setInvoice_type("OO");

        Centre receiver = new Centre();
        receiver.setAddress("ADDRESSS");
        receiver.setCode("CODE");
        receiver.setCountry("COUNTRY");
        receiver.setDescription("DESCRIPTION");
        receiver.setName("NAME");
        receiver.setPoblation("POBLATION");
        receiver.setPost_code("CODE1");
        receiver.setRole("1");
        ArrayList<Centre> receivers = new ArrayList<Centre>();
        receivers.add(receiver);
        draft.setReceiver_centres(receivers);

        Centre sender = new Centre();
        sender.setAddress("ADDRESSS");
        sender.setCode("CODE");
        sender.setCountry("COUNTRY");
        sender.setDescription("DESCRIPTION");
        sender.setName("NAME");
        sender.setPoblation("POBLATION");
        sender.setProvince("PROVINCE");
        sender.setPost_code("CODE1");
        sender.setRole("1");
        ArrayList<Centre> senders = new ArrayList<Centre>();
        senders.add(sender);
        draft.setSender_centres(senders);

        JsonParser parser = new JsonParser();
        body = parser.parse((new Gson()).toJson(draft, Draft.class)).getAsJsonObject();

        try {
            DraftResponse customerResponse = service.updateDraft(new Long(241), body);

            if (customerResponse.getResponseCode().equals(Constants.OK)) {
                System.out.println("Draft updated");

            } else {
                System.out.println(
                        "ERROR " + customerResponse.getErrorCode() + ": " + customerResponse.getErrorMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
