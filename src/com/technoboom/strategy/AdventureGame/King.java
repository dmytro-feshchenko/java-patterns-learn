package com.technoboom.strategy.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 2:35 PM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class King extends Character {
    public King() {
        setWeapon(new KnifeBehavior());
    }
}
