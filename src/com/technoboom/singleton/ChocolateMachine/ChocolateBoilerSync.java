package com.technoboom.singleton.ChocolateMachine;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/6/17
 * Time: 10:39 PM
 * Project: patterns-learn
 * Package: com.technoboom.singleton.ChocolateMachine
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ChocolateBoilerSync {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSync instance;

    private ChocolateBoilerSync() {
        empty = true;
        boiled = false;
    }

    public static synchronized ChocolateBoilerSync getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerSync();
        }
        return instance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Fill the boiler with chocolate");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
