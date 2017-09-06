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
public class ChocolateBoilerInitialized {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerInitialized instance =
            new ChocolateBoilerInitialized();

    private ChocolateBoilerInitialized() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerInitialized getInstance() {
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
