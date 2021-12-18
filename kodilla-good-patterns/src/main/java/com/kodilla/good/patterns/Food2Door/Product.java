package com.kodilla.good.patterns.Food2Door;

public class Product {

    private String name;
    private double price;
    private int count;

    public Product(){}

    public Product(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.count = product.getCount();
    }

    public Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
