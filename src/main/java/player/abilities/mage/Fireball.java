package player.abilities.mage;

import enemy.Enemy;
import player.abilities.Ability;
import player.Mage;

import java.util.random.RandomGenerator;

public class Fireball extends Ability {

    private final int minDamage;
    private final int maxDamage;
    private final Mage player;

    public Fireball(Mage player) {
        super("Fireball", AbilityType.OFFENSIVE, 20);
        this.player = player;
        minDamage = 5;
        maxDamage = 10;
    }

    public void cast(Enemy target) {
        int min = minDamage + player.getWeapon().getMinDamage();
        int max = maxDamage + player.getWeapon().getMaxDamage();
        System.out.printf("%s casts fireball on %s%n", player.getName(), target.getName());
        target.takeDamage(RandomGenerator.getDefault().nextInt(min, max + 1));
    }

    public int getMaxDamage() {
        return maxDamage + player.getWeapon().getMaxDamage();
    }

    public int getMinDamage() {
        return minDamage + player.getWeapon().getMinDamage();
    }
}
