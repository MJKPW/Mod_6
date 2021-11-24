package com.kodilla.testing.weather.stub;                                     // [1]

import org.junit.jupiter.api.Assertions;                                      // [2]
import org.junit.jupiter.api.Test;                                            // [3]

class WeatherForecastTestSuite {                                              // [4]

    @Test                                                                      // [5]
    void testCalculateForecastWithStub() {                                     // [6]
        //Given
        Temperatures temperatures = new TemperaturesStub();                     // [7]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);    // [8]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [9]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [10]
    }                                                                          // [11]
}