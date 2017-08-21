package com.technoboom.PizzaFactory;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 10:32 PM
 * Project: patterns-learn
 * Package: com.technoboom.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();

    public void cut() {
        System.out.println("Cut pizza: make 6 pieces");
    }
    public void box() {
        System.out.println("Use lunch box to pack the pizza");
    }
}
