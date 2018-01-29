package com.enxendra.huf.api.model.draft;

import com.enxendra.huf.api.model.HUFResponse;
import com.enxendra.huf.api.model.shared.Item;

import java.util.List;

public class DraftItemsListResponse extends HUFResponse {

    public List<Item> data;

    public List<Item> getData() {
        return data;
    }

    public void setData(List<Item> data) {
        this.data = data;
    }
}
