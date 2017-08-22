package com.technoboom.PizzaFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/17
 * Time: 1:06 PM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }

        return pizza;
    }
}
