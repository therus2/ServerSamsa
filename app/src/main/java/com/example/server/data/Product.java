package com.example.server.data;

import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private int cost;
    private String imageURL;
    private String description;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", imageURL='" + imageURL + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && cost == product.cost && Objects.equals(name, product.name) && Objects.equals(imageURL, product.imageURL) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost, imageURL, description);
    }

    public Product(long id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public Product(long id, String name, int cost, String imageURL, String description) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.imageURL = imageURL;
        this.description = description;
    }
}
