package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        World word = new World();

        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");
        Continent antarctica = new Continent("Antarctica");
        Continent africa = new Continent("Africa");

        //European
        Country poland = new Country("38153000");
        Country hungary = new Country("9730772");
        Country czechRepublic = new Country("10702942");
        Country slovakia = new Country("5459781");

        europe.addCountry(poland);
        europe.addCountry(hungary);
        europe.addCountry(czechRepublic);
        europe.addCountry(slovakia);

        //North America
        Country unitedStats = new Country("332790963");
        Country canada = new Country("38492341");
        Country mexico = new Country("126014024");

        northAmerica.addCountry(unitedStats);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        //South America
        Country brazil = new Country("214010991");
        Country argentina = new Country("45808747");
        Country venezuela = new Country("28705000");

        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(venezuela);

        //Asia
        Country china = new Country("1411778724");
        Country india = new Country("1384933962");
        Country japan = new Country("125070000");

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);

        //Australia
        Country australia_country = new Country("25906339");
        australia.addCountry(australia_country);

        //Australia
        Country antarctica_stub = new Country("2500");
        antarctica.addCountry(antarctica_stub);

        //Africa
        Country nigeria = new Country("211401000");
        Country ethiopia = new Country("117876000");
        Country egypt = new Country("102622258");

        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypt);

        word.addContinent(europe);
        word.addContinent(northAmerica);
        word.addContinent(southAmerica);
        word.addContinent(asia);
        word.addContinent(australia);
        word.addContinent(antarctica);
        word.addContinent(africa);

        //When
        BigInteger population = new BigInteger("0");
        for(String key : word.getWordPoplation().keySet()){
            Continent continent = word.getWordPoplation().get(key);
            List<Country> countries = continent.getCountries();
            for(Country current : countries)
                population = population.add(current.getPopulation());
        }

        //Then
        Assertions.assertEquals(7, word.getWordPoplation().size());
        Assertions.assertEquals(population, word.getPeopleQuantity());
    }
}
