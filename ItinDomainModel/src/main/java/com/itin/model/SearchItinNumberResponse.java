package com.itin.model;

public class SearchItinNumberResponse {

    private String orderNumber;
    private String orderStatus;

    public SearchItinNumberResponse(String orderNumber, String orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
