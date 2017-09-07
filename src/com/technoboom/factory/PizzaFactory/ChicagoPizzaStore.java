package com.technoboom.factory.PizzaFactory;

import com.technoboom.factory.PizzaFactory.factories.ChicagoPizzaIngridientFactory;
import com.technoboom.factory.PizzaFactory.factories.PizzaIngredientFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/17
 * Time: 1:06 PM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngridientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clams")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("Chicago Style Pizza with Clams");
        }

        return pizza;
    }
}
