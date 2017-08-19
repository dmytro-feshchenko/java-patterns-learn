package com.technoboom.WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 5:22 PM
 * Project: patterns-learn
 * Package: com.technoboom.WeatherStation
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " +
                "Temperature " + temperature + "; " +
                "Humidity " + humidity + "; " +
                "Pressure " + pressure + ".");
    }
}
