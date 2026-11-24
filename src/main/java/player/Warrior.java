package player;

import player.abilities.Ability;
import player.abilities.warrior.DefensiveStance;
import player.abilities.warrior.Slash;
import player.equipment.Weapon;

public class Warrior extends PlayerClass {

    private final Slash slash;
    private final DefensiveStance defensiveStance;

    public Warrior(String name) {
        super(name, ClassType.WARRIOR);
        slash = new Slash(this);
        defensiveStance = new DefensiveStance(this);
        setWeapon(new Weapon(Weapon.WeaponType.MELEE, 1));
    }

    @Override
    public Ability getOffensiveAbility() {
        return slash;
    }

    @Override
    public Ability getDefensiveAbility() {
        return defensiveStance;
    }

}
