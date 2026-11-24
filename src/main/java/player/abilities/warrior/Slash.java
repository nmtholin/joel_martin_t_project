package player.abilities.warrior;

import player.abilities.Ability;
import player.Warrior;

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
