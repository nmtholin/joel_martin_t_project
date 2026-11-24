package player.abilities.warrior;

import enemy.Enemy;
import player.abilities.Ability;
import player.Warrior;

import java.util.random.RandomGenerator;

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

    public void cast(Enemy target) {
        int min = minDamage + player.getWeapon().getMinDamage();
        int max = maxDamage + player.getWeapon().getMaxDamage();
        target.takeDamage(RandomGenerator.getDefault().nextInt(min, max + 1));
    }

    public int getMaxDamage() {
        return maxDamage + player.getWeapon().getMaxDamage();
    }

    public int getMinDamage() {
        return minDamage + player.getWeapon().getMinDamage();
    }

}
