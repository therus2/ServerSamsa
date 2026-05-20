package com.example.server.rest;

import com.example.server.data.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductServisAPI extends APIServise{
    @GET("products")
    Call<List<Product>> getAll();


    @GET("products/{id}")
    Call<Product> getById(@Path("id") long id);

}
