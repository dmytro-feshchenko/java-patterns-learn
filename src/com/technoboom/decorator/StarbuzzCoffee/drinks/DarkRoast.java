package com.technoboom.decorator.StarbuzzCoffee.drinks;

import com.technoboom.decorator.StarbuzzCoffee.Beverage;

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
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}
