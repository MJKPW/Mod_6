package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public interface Provider {
    String getProvider();
    void process(Order order);
}

