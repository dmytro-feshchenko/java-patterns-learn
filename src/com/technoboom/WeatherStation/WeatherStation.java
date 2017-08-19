package com.technoboom.WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 5:28 PM
 * Project: patterns-learn
 * Package: com.technoboom.WeatherStation
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        HeatIndexDisplay heatIndexDisplay =
                new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(35, 100, 30.4f);
        weatherData.setMeasurements(31, 98, 32.4f);
        weatherData.setMeasurements(28, 96, 29.4f);
    }
}
