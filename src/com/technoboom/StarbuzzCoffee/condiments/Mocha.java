package com.technoboom.StarbuzzCoffee.condiments;

import com.technoboom.StarbuzzCoffee.Beverage;
import com.technoboom.StarbuzzCoffee.CondimentDecorator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 3:26 PM
 * Project: patterns-learn
 * Package: com.technoboom.Starbuzz.condiments
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
