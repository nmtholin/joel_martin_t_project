package player;

import player.abilities.Ability;
import player.abilities.mage.Fireball;
import player.abilities.mage.FrostArmor;
import player.equipment.Weapon;

public class Mage extends PlayerClass {

    private final Fireball fireball;
    private final FrostArmor frostArmor;

    public Mage(String name) {
        super(name, ClassType.MAGE);
        fireball = new Fireball(this);
        frostArmor = new FrostArmor(this);
        setWeapon(new Weapon(Weapon.WeaponType.CASTER, 1));
    }

    @Override
    public Ability getOffensiveAbility() {
        return fireball;
    }

    @Override
    public Ability getDefensiveAbility() {
        return frostArmor;
    }

}
