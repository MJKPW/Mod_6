package com.kodilla.good.patterns.challenges;

public interface Item extends Data{
    double getPrice();
    void addToCart(User user);
}
