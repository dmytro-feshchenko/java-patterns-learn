package com.technoboom.observer.WeatherStationStandard;

import java.util.Observable;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/20/17
 * Time: 6:23 PM
 * Project: patterns-learn
 * Package: com.technoboom.observer.WeatherStationStandard
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    /**
     * Notifies all dependants about state changes
     */
    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    /**
     * Changes the measurements with new values
     * @param temperature   new temperature value
     * @param humidity      new humidity value
     * @param pressure      new pressure value
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * Returns current temperature
     * @return float
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * Returns current humidity
     * @return float
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * Returns current pressure
     * @return float
     */
    public float getPressure() {
        return pressure;
    }
}
