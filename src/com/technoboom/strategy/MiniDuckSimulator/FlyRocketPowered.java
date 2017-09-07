package com.technoboom.strategy.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 10:19 AM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.MiniDuckSimulator
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket");
    }
}
