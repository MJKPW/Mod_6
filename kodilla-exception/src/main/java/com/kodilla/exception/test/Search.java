package com.kodilla.exception.test;

import java.util.Map;
import java.util.HashMap;

public class Search {
    private final Map<String, Boolean> airportAvailability;

    public Search(){
        airportAvailability = new HashMap<>();
    }

    public String findFlight(Flight flight) throws RouteNotFoundException{
        boolean found = false;
        String nameTarget = flight.getArrivalAirport();
        if(airportAvailability.containsKey(nameTarget)) {
            String message = nameTarget + " is ";
            return message += (airportAvailability.get(nameTarget))? "available": "not available";
        }
        throw new RouteNotFoundException("Airport not found");
    }

    public void addAirport(String name, boolean availability){
        airportAvailability.put(name, availability);
    }
}
