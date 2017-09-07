package com.technoboom.factory.PizzaFactory.ingridients;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/5/17
 * Time: 10:59 PM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory.ingridients
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ThinCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thich Crust Dough";
    }
}
