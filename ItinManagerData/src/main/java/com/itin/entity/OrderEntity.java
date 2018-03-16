package com.itin.entity;

import com.itin.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ORDERS")
public class OrderEntity extends BaseEntity{

    @Column(name="ORDER_NUMBER")
    private String orderNumber;

    @Column(name="ORDER_STATUS")
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
