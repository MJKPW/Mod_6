package com.kodilla.good.patterns.flights;

public class AirportNotAvailableException extends RuntimeException {
    public AirportNotAvailableException(String name) {
        super(name + " not available");
    }
}
