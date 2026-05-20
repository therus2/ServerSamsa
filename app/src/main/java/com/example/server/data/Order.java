package com.example.server.data;

import java.security.Timestamp;

public class Order {
    private long id;
    private long productId;
    private long castomerId;
    private Timestamp date;

    public long getId() {
        return id;
    }

    public long getProductId() {
        return productId;
    }

    public long getCastomerId() {
        return castomerId;
    }

    public Timestamp getDate() {
        return date;
    }

    public Order(long productId, long castomerId, Timestamp date) {
        this.productId = productId;
        this.castomerId = castomerId;
        this.date = date;
    }

    public Order(long id, long productId, long castomerId, Timestamp date) {
        this.id = id;
        this.productId = productId;
        this.castomerId = castomerId;
        this.date = date;
    }
}
