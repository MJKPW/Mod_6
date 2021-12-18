package com.kodilla.good.patterns.Food2Door;

import java.util.LinkedList;

public class ExtraFoodShop extends Shop implements Provider {

    public static final String _NAME = "Extra Food Shop";

    public ExtraFoodShop() {}

    public ExtraFoodShop(LinkedList<Product> storage) {
        super(storage);
    }

    @Override
    public String getProvider() {
        return ExtraFoodShop._NAME;
    }

    @Override
    public void process(Order order) {
        if(order.getBill() > 100) {
            Product extra = new Product(order.getCart().get(0));
            extra.setPrice(0);
            order.addOrder(extra);
        }
        System.out.println("Your order: ");
        System.out.println(order);
        System.out.println("Bill : " + order.getBill());
    }
}
