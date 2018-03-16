package com.itin.model;

public class SearchItinNumberRequest {

    private String orderNumber;

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
