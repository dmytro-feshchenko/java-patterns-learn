package com.technoboom.strategy.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/18/17
 * Time: 1:24 PM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.MiniDuckSimulator
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("[Sound] Squeak");
    }
}
