package com.technoboom.PizzaFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 10:31 PM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
