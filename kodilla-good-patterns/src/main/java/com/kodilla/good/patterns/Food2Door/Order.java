package com.kodilla.good.patterns.Food2Door;

import java.util.LinkedList;
import java.util.List;

public class Order {

    private double bill;
    private final List<Product> cart;

    public Order() {
        bill = 0;
        cart = new LinkedList<>();
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void addOrder(Product product) {
        cart.add(product);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Product product : cart) {
            String line = product.getName() + " | costs : " +
                    product.getPrice() + " | " + product.getCount() + " left" + "\n";
            builder.append(line);
        }
        return builder.toString();
    }

}
