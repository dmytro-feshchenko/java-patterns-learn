package com.technoboom.PizzaFactory.factories;

import com.technoboom.PizzaFactory.ingridients.*;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/24/17
 * Time: 9:51 PM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory.ingridients
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ChicagoPizzaIngridientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new BlackOlives(), new Spinach(), new EggPlant() };
    }
}
