package com.technoboom.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/18/17
 * Time: 5:25 PM
 * Project: patterns-learn
 * Package: com.technoboom.MiniDuckSimulator
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("[Look] Bait for ducks");
    }
}
