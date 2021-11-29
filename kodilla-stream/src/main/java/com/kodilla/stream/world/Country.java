package com.kodilla.stream.world;

import java.math.BigInteger;

public class Country {

    private final BigInteger population;

    public Country(String population){
        this.population = new BigInteger(population);
    }

    public BigInteger getPopulation(){
        return population;
    }

}
