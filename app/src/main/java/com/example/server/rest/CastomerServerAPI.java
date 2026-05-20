package com.example.server.rest;

import com.example.server.data.Customer;

import retrofit2.Call;
import retrofit2.http.POST;

public interface CastomerServerAPI extends APIServise{
    @POST("/castomers/login")
    Call<Customer> login(Customer castomer);
}
