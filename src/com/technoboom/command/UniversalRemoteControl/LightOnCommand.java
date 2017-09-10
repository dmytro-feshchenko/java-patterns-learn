package com.technoboom.command.UniversalRemoteControl;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/10/17
 * Time: 9:55 PM
 * Project: patterns-learn
 * Package: com.technoboom.command.UniversalRemoteControl
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
