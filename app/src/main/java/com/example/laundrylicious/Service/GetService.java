package com.example.laundrylicious.Service;

import com.example.laundrylicious.SetterGetter;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetService {
    @GET("/Linaqruf/Laundrylicious/SetterGetter")
    Call<ArrayList<SetterGetter>> getOrderKe();
    @POST("/Linaqruf/Laundrylicious/SetterGetter")
    Call<ArrayList<SetterGetter>> addOrderKe(@Body SetterGetter order);
}