package com.kodilla.good.patterns.Food2Door;

import java.util.LinkedList;

public class HealthyShop extends Shop implements Provider {

    public static final String _NAME = "Healthy Shop";

    public HealthyShop() {}

    public HealthyShop(LinkedList<Product> storage) {
        super(storage);
    }

    @Override
    public String getProvider() {
        return HealthyShop._NAME;
    }

    @Override
    public void process(Order order) {
        if(order.getBill() > 20) {
            Product extra = new Product("Salad", 0, 1);
            order.addOrder(extra);
        }
        System.out.println("Your order: ");
        System.out.println(order);
        System.out.println("Bill : " + order.getBill());
    }
}
