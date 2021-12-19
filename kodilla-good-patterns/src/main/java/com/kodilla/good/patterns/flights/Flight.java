package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    private final Airport startingPoint;
    private final Airport destination;
    private final String flightId;

    public Flight(Airport startingPoint, Airport destination) {
        this.startingPoint = startingPoint;
        this.destination = destination;
        this.flightId = Character.toString(startingPoint.getName().charAt(0)) +
                        Character.toString(startingPoint.getName().charAt(1)) +
                        Character.toString(destination.getName().charAt(0)) +
                        Character.toString(destination.getName().charAt(1));
    }

    public Airport getStartingPoint() {
        return startingPoint;
    }

    public Airport getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Flight id " + flightId
                + " from " + startingPoint.getName()
                + " to " + destination.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightId, flight.flightId);
    }

}
