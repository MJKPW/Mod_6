package com.kodilla.good.patterns.Food2Door;

public class ProductNotAvailableException extends RuntimeException {
    public ProductNotAvailableException(String warning){
        super(warning);
    }
}
