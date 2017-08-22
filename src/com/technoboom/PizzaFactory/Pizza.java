package com.technoboom.PizzaFactory;

import java.util.ArrayList;

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
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing pizza: " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("Topping " + (i + 1) + ": " + toppings.get(i));
        }
    }
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut pizza: make 6 pieces");
    }
    public void box() {
        System.out.println("Use lunch box to pack the pizza");
    }

    public String getName() {
        return name;
    }
}
