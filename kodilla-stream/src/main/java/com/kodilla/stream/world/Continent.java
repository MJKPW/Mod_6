package com.kodilla.stream.world;

import java.util.List;
import java.util.ArrayList;

public class Continent {

    private final String name;
    private final List<Country> countries;

    public Continent(String name){
        this.name = name;
        countries = new ArrayList<>();
    }

    public List<Country> getCountries() {
        return countries;
    }

    public String getName(){
        return name;
    }

    public void addCountry(Country country){
        countries.add(country);
    }
}