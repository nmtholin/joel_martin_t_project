package player.abilities;

import enemy.Enemy;
import player.PlayerClass;

import java.util.random.RandomGenerator;

public class Ability {

    public enum AbilityType {
        OFFENSIVE, DEFENSIVE
    }

    private final String name;
    private final AbilityType abilityType;
    private final int resourceCost;


    public Ability(String name, AbilityType abilityType, int resourceCost) {
        this.name = name;
        this.abilityType = abilityType;
        this.resourceCost = resourceCost;
    }

//    public void cast(Enemy target, PlayerClass player) {
//        int min = player.getOffensiveAbility(). + player.getWeapon().getMinDamage();
//        int max = maxDamage + player.getWeapon().getMaxDamage();
//        target.takeDamage(RandomGenerator.getDefault().nextInt(min, max + 1));
//    }

    public void cast() {}

    public void cast(Enemy target) {}

    public String getName() {
        return name;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

}
