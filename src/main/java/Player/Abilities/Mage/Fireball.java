package Player.Abilities.Mage;

//import Player.Abilities.Ability;
import Player.Abilities.Ability;
import Player.Mage;

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

    // Enemy target
    public void cast(String target) {
        int min = minDamage + player.getWeapon().getMinDamage();
        int max = maxDamage + player.getWeapon().getMaxDamage();
        // target.damage(RandomGenerator.getDefault().nextInt(min, max + 1));
    }

    public int getMaxDamage() {
        return maxDamage + player.getWeapon().getMaxDamage();
    }

    public int getMinDamage() {
        return minDamage + player.getWeapon().getMinDamage();
    }
}
