package com.kodilla.good.patterns.challenges;

public class ProductNotAvailableException extends RuntimeException{
    public ProductNotAvailableException(String warning) {
        super(warning);
    }
}

