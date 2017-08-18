package com.technoboom.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/18/17
 * Time: 1:19 PM
 * Project: patterns-learn
 * Package: com.technoboom.MiniDuckSimulator
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
