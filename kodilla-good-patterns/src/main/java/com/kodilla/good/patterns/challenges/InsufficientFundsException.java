package com.kodilla.good.patterns.challenges;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String warning) {
        super(warning);
    }
}
