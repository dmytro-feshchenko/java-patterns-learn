package com.technoboom.StarbuzzCoffee.drinks;

import com.technoboom.StarbuzzCoffee.Beverage;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 3:25 PM
 * Project: patterns-learn
 * Package: com.technoboom.Starbuzz.drinks
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
