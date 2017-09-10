package com.technoboom.command.UniversalRemoteControl;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/10/17
 * Time: 9:56 PM
 * Project: patterns-learn
 * Package: com.technoboom.command.UniversalRemoteControl
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Light {
    private boolean enabled = false;

    public Light() {
    }

    public void on() {
        this.enabled = true;
        System.out.println("Light on");
    }

    public void off() {
        this.enabled = false;
        System.out.println("Light off");
    }
}
