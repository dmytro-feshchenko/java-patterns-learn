package com.technoboom.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 2:34 PM
 * Project: patterns-learn
 * Package: com.technoboom.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Queen extends Character {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }
}
