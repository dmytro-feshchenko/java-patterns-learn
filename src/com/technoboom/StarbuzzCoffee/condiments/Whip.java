package com.technoboom.StarbuzzCoffee.condiments;

import com.technoboom.StarbuzzCoffee.Beverage;
import com.technoboom.StarbuzzCoffee.CondimentDecorator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 3:30 PM
 * Project: patterns-learn
 * Package: com.technoboom.Starbuzz.condiments
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
