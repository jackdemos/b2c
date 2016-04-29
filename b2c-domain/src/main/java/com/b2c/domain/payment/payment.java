package com.b2c.domain.payment;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Oakley on 2016-03-24.
 */
public class payment implements Serializable {
    private  String id;
    /**
     * 支付流水号
     */
    private String dealNumber;
    /**
     * 订单号
     */
    private String orderNumber;
    /**
     * 订单应该金额
     */
    private int orderMoney;
    /**
     * 支付金额
     */
    private String paymentMoney;

    /**
     * 支付渠道
     */
    private String channel;

    /**
     * 创建时间
     */
    private Date createdTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDealNumber() {
        return dealNumber;
    }

    public void setDealNumber(String dealNumber) {
        this.dealNumber = dealNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(int orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getPaymentMoney() {
        return paymentMoney;
    }

    public void setPaymentMoney(String paymentMoney) {
        this.paymentMoney = paymentMoney;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
