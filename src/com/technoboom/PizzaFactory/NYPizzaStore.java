package com.technoboom.PizzaFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/17
 * Time: 11:40 AM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }

        return pizza;
    }
}
