package com.example.server.data;

import java.util.List;
import java.util.Objects;

public class Customer {
    private long id;
    private String login;
    private String pasvord;
    private List<Order> orders;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(login, customer.login) && Objects.equals(pasvord, customer.pasvord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, pasvord);
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasvord() {
        return pasvord;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Customer(long id, String login, String pasvord, List<Order> orders) {
        this.id = id;
        this.login = login;
        this.pasvord = pasvord;
        this.orders = orders;
    }
}
