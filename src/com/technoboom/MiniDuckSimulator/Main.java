package com.technoboom.MiniDuckSimulator;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck bait = new ModelDuck();
        bait.performFly();
        bait.setFlyBehavior(new FlyRocketPowered());
        bait.performFly();
    }
}
