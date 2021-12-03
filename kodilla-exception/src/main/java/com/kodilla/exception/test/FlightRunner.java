package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args){
        Search search = new Search();
        search.addAirport("Denver International Airport", false);
        search.addAirport("Charles de Gaulle Airport", true);
        search.addAirport("Heathrow Airport International Airport", false);

        try{
            System.out.println(search.findFlight(new Flight("Denver International Airport",
                    "Charles de Gaulle Airport")));
        }
        catch (RouteNotFoundException e){
            System.out.println("Airport not found");
        }

        try{
            System.out.println(search.findFlight(new Flight("Heathrow Airport International Airport",
                    "Denver International Airport")));
        }
        catch (RouteNotFoundException e){
            System.out.println("Airport not found");
        }

        try{
            System.out.println(search.findFlight(new Flight("Heathrow Airport International Airport",
                    "Hervey Bay Airport")));
        }
        catch (RouteNotFoundException e){
            System.out.println("Airport not found");
        }
    }
}

