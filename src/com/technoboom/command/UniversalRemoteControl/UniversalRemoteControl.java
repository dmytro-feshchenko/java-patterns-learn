package com.technoboom.command.UniversalRemoteControl;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/10/17
 * Time: 10:00 PM
 * Project: patterns-learn
 * Package: com.technoboom.command.UniversalRemoteControl
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class UniversalRemoteControl {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);

        remote.buttonWasPressed();
    }
}
