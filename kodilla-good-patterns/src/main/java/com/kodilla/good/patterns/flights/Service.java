package com.kodilla.good.patterns.flights;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

    private final List<Flight> flights;
    private final List<Airport> airports;

    public Service() {
        flights = new LinkedList<>();
        airports = new LinkedList<>();
    }

    public void addAirport(Airport airport) {
        if(!airports.contains(airport))
            airports.add(airport);
    }

    public void bookAFlight(Flight flight) {
        if(!airports.contains(flight.getStartingPoint()))
            throw new AirportNotAvailableException(flight.getStartingPoint().getName());
        else if(!airports.contains(flight.getDestination()))
            throw new AirportNotAvailableException(flight.getDestination().getName());
        flights.add(new Flight(flight.getStartingPoint(), flight.getDestination()));
    }

    public List<Flight> findAllFlightsFrom(Airport airport) {
        return flights.stream()
              .filter(flight -> flight.getStartingPoint().equals(airport))
              .collect(Collectors.toList());
    }

    public List<Flight> findAllFlightsTo(Airport airport) {
        return flights.stream()
              .filter(flight -> flight.getDestination().equals(airport))
              .collect(Collectors.toList());
    }

    public List<Airport> findAlternativeAirport(Flight flight) {
        List<Flight> alternatives = findAllFlightsTo(flight.getDestination());
        return alternatives.stream().
                            map(Flight::getStartingPoint).
                            filter(port -> port != flight.getStartingPoint()).
                            collect(Collectors.toList());
    }

}
