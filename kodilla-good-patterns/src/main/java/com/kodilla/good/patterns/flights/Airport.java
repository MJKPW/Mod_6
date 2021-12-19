package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Airport {

    private final String name;
    private final Map<Flight, String> flightTable;

    public Airport(String name) {
        this.name = name;
        flightTable = new HashMap<>();
    }

    public void addFlight(Flight flight) {
        if(flight.getStartingPoint() == this)
            flightTable.put(flight, "From");
        else if(flight.getDestination() == this)
            flightTable.put(flight, "To");
        else
            throw new WrongFlightException();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append("\n");
        for(Flight key : flightTable.keySet()) {
            builder.append(key.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(name, airport.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flightTable);
    }
}
