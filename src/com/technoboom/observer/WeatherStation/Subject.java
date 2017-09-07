package com.technoboom.observer.WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 5:04 PM
 * Project: patterns-learn
 * Package: com.technoboom.observer.WeatherStation
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
