package com.technoboom.command.UniversalRemoteControl;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/10/17
 * Time: 9:58 PM
 * Project: patterns-learn
 * Package: com.technoboom.command.UniversalRemoteControl
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
