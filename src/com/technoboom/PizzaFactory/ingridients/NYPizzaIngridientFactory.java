package com.technoboom.PizzaFactory.ingridients;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/24/17
 * Time: 9:47 PM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory.ingridients
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class NYPizzaIngridientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClam();
    }
}
