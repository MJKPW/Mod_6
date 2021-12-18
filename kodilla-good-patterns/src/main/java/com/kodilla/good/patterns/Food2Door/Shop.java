package com.kodilla.good.patterns.Food2Door;

import java.util.List;
import java.util.LinkedList;

public class Shop {

    private final List<Product> products;

    public Shop() {
        products = new LinkedList<>();
    }

    public Shop(LinkedList<Product> storage) {
        products = storage;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public boolean checkIfAvailable(Product product) {
        return products.contains(product);
    }

    public void addToCart(Order order, Product product, int amount) {
        if(amount <= 0)
            throw new IllegalArgumentException("Negative order amount");
        for(int i = 0; i != amount; ++i) {
            if (!checkIfAvailable(product)) {
                throw new ProductNotAvailableException(product.getName() + " not unavailable");
            } else if (product.getCount() <= 0) {
                throw new ProductNotAvailableException(product.getName() + " not unavailable");
            } else {
                order.setBill(order.getBill() + product.getPrice());
                order.addOrder(product);
                product.setCount(product.getCount() - 1);
            }
        }
    }

    public String showMenu() {
        return toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for(Product product : products) {
            String line = product.getName() + " | costs : " +
                    product.getPrice() + " | " + product.getCount() + " left" + "\n";
            builder.append(line);
        }
        return builder.toString();
    }
}
