package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {

        Service service = new Service();

        Airport warszawa = new Airport("Warszawa");
        Airport krakow = new Airport("Kraków");
        Airport wroclaw = new Airport("Wrocław");
        Airport gdansk = new Airport("Gdańsk");

        service.addAirport(warszawa);
        service.addAirport(krakow);
        service.addAirport(wroclaw);
        service.addAirport(gdansk);

        Flight waToKrFlight = new Flight(warszawa, krakow);
        warszawa.addFlight(waToKrFlight);
        service.bookAFlight(waToKrFlight);

        Flight waToWrFlight = new Flight(warszawa, wroclaw);
        warszawa.addFlight(waToWrFlight);
        service.bookAFlight(waToWrFlight);

        Flight krToWaFlight = new Flight(krakow, warszawa);
        krakow.addFlight(krToWaFlight);
        service.bookAFlight(krToWaFlight);

        Flight wrToKrFlight = new Flight(wroclaw, krakow);
        wroclaw.addFlight(wrToKrFlight);
        service.bookAFlight(wrToKrFlight);

        Flight gdToKrFlight = new Flight(gdansk, krakow);
        gdansk.addFlight(gdToKrFlight);
        service.bookAFlight(gdToKrFlight);

        service.addAirport(warszawa);
        service.addAirport(krakow);
        service.addAirport(wroclaw);

        System.out.println(warszawa);
        System.out.println(krakow);
        System.out.println(wroclaw);
        System.out.println(gdansk);

        System.out.println("All flights from Warsaw");
        for(Flight flight : service.findAllFlightsFrom(warszawa))
            System.out.println(flight);

        System.out.println("All flights to Cracow");
        for(Flight flight : service.findAllFlightsTo(krakow))
            System.out.println(flight);

        System.out.println("Alternatives from Wroclaw to Cracow");
        for(Airport airport : service.findAlternativeAirport(wrToKrFlight))
            System.out.println(airport.getName());
    }
}
