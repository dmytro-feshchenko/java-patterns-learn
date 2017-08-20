package com.technoboom.WeatherStationStandard;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/20/17
 * Time: 6:42 PM
 * Project: patterns-learn
 * Package: com.technoboom.WeatherStationStandard
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class WeatherStationStandard {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.setMeasurements(32, 80, 50.2f);
        weatherData.setMeasurements(35, 76, 60);
    }
}
