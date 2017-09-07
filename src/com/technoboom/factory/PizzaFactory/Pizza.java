package com.technoboom.factory.PizzaFactory;

import com.technoboom.factory.PizzaFactory.ingridients.*;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/21/17
 * Time: 10:32 PM
 * Project: patterns-learn
 * Package: com.technoboom.factory.PizzaFactory
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    ArrayList<String> toppings = new ArrayList<>();

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut pizza: make 6 pieces");
    }

    void box() {
        System.out.println("Use lunch box to pack the pizza");
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Pizza";
    }
}
