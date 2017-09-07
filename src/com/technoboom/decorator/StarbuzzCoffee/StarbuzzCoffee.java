package com.technoboom.decorator.StarbuzzCoffee;

import com.technoboom.decorator.StarbuzzCoffee.condiments.Mocha;
import com.technoboom.decorator.StarbuzzCoffee.condiments.Soy;
import com.technoboom.decorator.StarbuzzCoffee.condiments.Whip;
import com.technoboom.decorator.StarbuzzCoffee.drinks.DarkRoast;
import com.technoboom.decorator.StarbuzzCoffee.drinks.Espresso;
import com.technoboom.decorator.StarbuzzCoffee.drinks.HouseBlend;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 3:31 PM
 * Project: patterns-learn
 * Package: com.technoboom.Starbuzz
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription()
                + " $" + beverage.cost()
        );


        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost()
        );

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost()
        );
    }
}
