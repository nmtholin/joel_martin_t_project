package Player;

import Player.Abilities.Mage.Fireball;
import Player.Abilities.Mage.FrostArmor;

public class Mage extends PlayerClass {

    private final Fireball fireball;
    private final FrostArmor frostArmor;

    public Mage(String name) {
        super(name, ClassType.MAGE);
        fireball = new Fireball(this);
        frostArmor = new FrostArmor(this);
        setWeapon(new Weapon(Weapon.WeaponType.CASTER, 1));
    }

    public Fireball fireball() {
        return fireball;
    }

    public FrostArmor frostArmor() {
        return frostArmor;
    }

}
