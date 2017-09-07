package com.technoboom.factory.PizzaFactory.factories;

import com.technoboom.factory.PizzaFactory.ingridients.*;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/24/17
 * Time: 9:45 PM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
