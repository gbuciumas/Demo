package com.itin.model;

import com.sun.istack.internal.NotNull;

public class SearchItinNumberRequest {

    @NotNull
    private String orderNumber;

    public SearchItinNumberRequest(){ }

    public SearchItinNumberRequest(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
