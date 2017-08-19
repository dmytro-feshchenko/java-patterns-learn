package com.technoboom.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 1:34 PM
 * Project: patterns-learn
 * Package: com.technoboom.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class Knight extends Character {
    public Knight() {
        setWeapon(new SwordBehavior());
    }
}
