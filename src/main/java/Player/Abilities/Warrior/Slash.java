package Player.Abilities.Warrior;

import Player.Abilities.Ability;
import Player.Warrior;

public class Slash extends Ability {

    private final int minDamage;
    private final int maxDamage;
    private final Warrior player;

    public Slash(Warrior player) {
        super("Slash", AbilityType.OFFENSIVE, 20);
        this.player = player;
        minDamage = 5;
        maxDamage = 10;
    }

    public int getMaxDamage() {
        return maxDamage + player.getWeapon().getMaxDamage();
    }

    public int getMinDamage() {
        return minDamage + player.getWeapon().getMinDamage();
    }

}
