package com.technoboom.observer.WeatherStationStandard;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/20/17
 * Time: 6:33 PM
 * Project: patterns-learn
 * Package: com.technoboom.observer.WeatherStationStandard
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather conditions:\n" +
                "temperature " + temperature + "\n" +
                "humidity " + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
