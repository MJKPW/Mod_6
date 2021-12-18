package com.kodilla.good.patterns.Food2Door;

import java.util.LinkedList;

public class GlutenFreeShop extends Shop implements Provider {

    public static final String _NAME = "Gluten Free Shop";

    public GlutenFreeShop() {}

    public GlutenFreeShop(LinkedList<Product> storage) {
        super(storage);
    }

    @Override
    public String getProvider() {
        return GlutenFreeShop._NAME;
    }

    @Override
    public void process(Order order) {
        System.out.println("Your gluten free order: ");
        System.out.println(order);
        System.out.println("Bill : " + order.getBill());
    }
}
