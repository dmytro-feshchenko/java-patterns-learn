package com.technoboom.ChocolateMachine;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/6/17
 * Time: 10:39 PM
 * Project: patterns-learn
 * Package: com.technoboom.ChocolateMachine
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class ChocolateBoilerVolatile {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoilerVolatile instance;

    private ChocolateBoilerVolatile() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerVolatile getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoilerVolatile.class) {
                if (instance == null) {
                    instance = new ChocolateBoilerVolatile();
                }
            }
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
