package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double tempMean(){
        double sum = 0;
        Map<String, Double> data = temperatures.getTemperatures();
        for(String key : data.keySet())
            sum += data.get(key);
        return sum / data.size();
    }

    public double tempMedian(){
        Map<String, Double> data = temperatures.getTemperatures();
        double[] values = ProcessData.toArr(data);
        ProcessData.mergeSort(values, 0, values.length-1);
        if((values.length & 1) == 0)
            return (values[values.length/2 - 1] + values[values.length/2])/2;
        else
            return values[values.length/2];
    }
}