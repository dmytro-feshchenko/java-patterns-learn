package com.technoboom.StarbuzzCoffee;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 3:20 PM
 * Project: patterns-learn
 * Package: com.technoboom.Starbuzz
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
