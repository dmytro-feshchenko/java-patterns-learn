package com.technoboom.observer.WeatherStationStandard;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/20/17
 * Time: 6:38 PM
 * Project: patterns-learn
 * Package: com.technoboom.observer.WeatherStationStandard
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float currentPressure = 30.2f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast:\n" +
                "last pressure: " + lastPressure + "\n" +
                "current pressure: " + currentPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
