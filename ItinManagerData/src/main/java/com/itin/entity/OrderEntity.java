package main.java.com.itin.entity;

import javax.persistence.Entity;

@Entity
public class OrderEntity {


    private String orderNumber;
    private String orderStatus;

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
