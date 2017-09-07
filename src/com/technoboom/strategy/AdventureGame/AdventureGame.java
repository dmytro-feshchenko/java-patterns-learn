package com.technoboom.strategy.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 1:27 PM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class AdventureGame {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();
    }
}
