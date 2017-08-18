package com.technoboom.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/18/17
 * Time: 1:05 PM
 * Project: patterns-learn
 * Package: com.technoboom.GameUDuck
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
