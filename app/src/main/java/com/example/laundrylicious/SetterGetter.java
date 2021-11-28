package com.example.laundrylicious;

public class SetterGetter {
    String orderke;
    String status;
    String total;

    public SetterGetter(String orderke, String status, String total) {
        this.orderke = orderke;
        this.status = status;
        this.total = total;
    }

    public String getOrderke() {
        return orderke;
    }

    public void setOrderke(String orderke) {
        this.orderke = orderke;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
