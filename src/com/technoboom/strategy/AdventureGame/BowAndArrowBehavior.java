package com.technoboom.strategy.AdventureGame;

/**
 * Created by IntelliJ IDEA.
 * Date: 8/19/17
 * Time: 1:31 PM
 * Project: patterns-learn
 * Package: com.technoboom.strategy.AdventureGame
 *
 * @author dmitryi
 * @version 1.0
 * @since 1.0
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("[Attack with bow and arrow]");
    }
}
