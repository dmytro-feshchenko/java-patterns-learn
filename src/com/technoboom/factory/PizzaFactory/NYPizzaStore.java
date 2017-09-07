package com.technoboom.factory.PizzaFactory;

import com.technoboom.factory.PizzaFactory.factories.NYPizzaIngridientFactory;
import com.technoboom.factory.PizzaFactory.factories.PizzaIngredientFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/22/17
 * Time: 11:40 AM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngridientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (type.equals("clams")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("NY Style Pizza with Clams");
        }

        return pizza;
    }
}
