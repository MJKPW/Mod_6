package com.kodilla.stream.world;

import java.util.Map;
import java.util.HashMap;
import java.math.BigInteger;

public class World {

    private final Map<String, Continent> wordPoplation;

    public World(){
        wordPoplation = new HashMap<>();
    }

    public Map<String, Continent> getWordPoplation() {
        return wordPoplation;
    }

    public void addContinent(Continent continent){
        wordPoplation.put(continent.getName(), continent);
    }

    public BigInteger getPeopleQuantity(){
        return wordPoplation.entrySet().
                               stream().
                               flatMap(continent->continent.getValue().getCountries().stream()).
                               map(Country::getPopulation).
                               reduce(new BigInteger("0"), (globalPopulation, countryPopulation)
                                       -> globalPopulation = globalPopulation.add(countryPopulation));
    }
}
