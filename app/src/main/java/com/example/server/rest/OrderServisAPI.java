package com.example.server.rest;

import com.example.server.data.Order;

import retrofit2.Call;
import retrofit2.http.POST;

public interface OrderServisAPI extends APIServise {
    @POST("/orders")
    Call<Order> insert(Order order);
}
