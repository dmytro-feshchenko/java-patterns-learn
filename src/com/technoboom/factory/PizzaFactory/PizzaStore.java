package com.technoboom.factory.PizzaFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 10:35 PM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
