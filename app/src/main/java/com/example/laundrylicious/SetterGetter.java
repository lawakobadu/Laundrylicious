package com.example.laundrylicious;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SetterGetter {

    @SerializedName("orderke")
    @Expose
    private Integer orderke;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("total")
    @Expose
    private Integer total;


    public SetterGetter() {
    }

    public SetterGetter(Integer orderke, String status, Integer total) {
        super();
        this.orderke = orderke;
        this.status = status;
        this.total = total;
    }

    public Integer getOrderke() {
        return orderke;
    }

    public void setOrderke(Integer orderke) {
        this.orderke = orderke;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}