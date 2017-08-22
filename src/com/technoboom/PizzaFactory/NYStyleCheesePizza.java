package com.technoboom.PizzaFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 10:33 PM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare cheese pizza in NY style");
    }

    @Override
    public void bake() {
        System.out.println("Bake cheese pizza in NY style");
    }
}
