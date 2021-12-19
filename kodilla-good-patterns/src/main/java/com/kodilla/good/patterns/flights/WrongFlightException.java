package com.kodilla.good.patterns.flights;

public class WrongFlightException extends RuntimeException {
    public WrongFlightException() {
        super("Flight and airport do not match");
    }
}
