package com.technoboom.strategy.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 1:33 PM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public abstract class Character {
    private WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior wp) {
        weapon = wp;
    }
}
