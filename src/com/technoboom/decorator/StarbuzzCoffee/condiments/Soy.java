package com.technoboom.decorator.StarbuzzCoffee.condiments;

import com.technoboom.decorator.StarbuzzCoffee.Beverage;
import com.technoboom.decorator.StarbuzzCoffee.CondimentDecorator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 3:28 PM
 * Project: patterns-learn
 * Package: com.technoboom.Starbuzz.condiments
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
