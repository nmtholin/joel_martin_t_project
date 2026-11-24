package player;

import player.equipment.Weapon;

public class Warrior extends PlayerClass {

    public Warrior(String name) {
        super(name, ClassType.WARRIOR);
        setWeapon(new Weapon(Weapon.WeaponType.MELEE, 1));
    }


}
