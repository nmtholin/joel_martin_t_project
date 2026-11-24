package player;

import player.abilities.Ability;
import player.equipment.*;

import java.util.Objects;

public class PlayerClass {

    public enum ClassType {
        WARRIOR, MAGE
    }

    private final String name;
    private int healthPoints;
    private int damageReduction;
    private int resourcePoints;
    private Weapon weapon;
    private Armor armor;
    private int normalKills;
    private int bossKills;
    private final ClassType classType;

    public PlayerClass(String name, ClassType classType) {
        Objects.requireNonNull(name);
        this.classType = classType;
        this.name = name;
        healthPoints = 100;
        resourcePoints = 100;
        damageReduction = 0;
    }

    public void recoverHealth() {
        healthPoints = (int) (healthPoints + healthPoints * 1.2);
    }

    public void recoverResource() {
        resourcePoints = (int) (resourcePoints + resourcePoints * 1.2);
    }

    public void takeDamage(int damage) {
        healthPoints -= damage;
    }

    public void spendResource(int amount) {
        resourcePoints -= amount;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getResourcePoints() {
        return resourcePoints;
    }

    public Ability getOffensiveAbility() {
        return null;
    }

    public Ability getDefensiveAbility() {
        return null;
    }

    public int getNormalKills() {
        return normalKills;
    }

    public int getBossKills() {
        return bossKills;
    }

    public void incrementKills(String enemy) {
        // if Enemy.NORMAL/Enemy.BOSS
        if (enemy.equals("normal")) {
            normalKills++;
        } else if (enemy.equals("boss")) {
            bossKills++;
        }
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setDamageReduction(int amount) {
        damageReduction = amount;
    }
}
