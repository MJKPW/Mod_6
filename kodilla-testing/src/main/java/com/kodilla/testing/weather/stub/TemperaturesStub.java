package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures {

    @Override
    public Map<String, Double> getTemperatures() {
        Map<String, Double> stubResult = new HashMap<>();

        // dummy data
        stubResult.put("Rzeszow", 25.5);
        stubResult.put("Krakow", 26.2);
        stubResult.put("Wroclaw", 24.8);
        stubResult.put("Warszawa", 25.2);
        stubResult.put("Gdansk", 26.1);

        return stubResult;
    }

    public double tempMean(){
        double sum = 0;
        Map<String, Double> data = getTemperatures();
        for(String key : data.keySet())
            sum += data.get(key);
        return sum / data.size();
    }

    public double tempMedian(){
        return 2.0;
    }
}