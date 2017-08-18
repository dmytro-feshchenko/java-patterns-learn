package com.technoboom.MiniDuckSimulator;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/18/17
 * Time: 1:23 PM
 * Project: patterns-learn
 * Package: com.technoboom.MiniDuckSimulator
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("[Silence]");
    }
}
