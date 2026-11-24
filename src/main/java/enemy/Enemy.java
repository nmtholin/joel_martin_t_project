package enemy;

import java.util.random.RandomGenerator;

public class Enemy {
    private String name;
    private int hp;
    private int level;
    private int minDamage;
    private int maxDamage;
    private double dropRate;
    private static final RandomGenerator randomDamage =
    RandomGenerator.getDefault();

    public Enemy(String name, int hp, int level, int minDamage, int maxDamage, double dropRate) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.dropRate = dropRate;
    }

    public int enemyAttack() {
        return randomDamage.nextInt(minDamage, maxDamage + 1);
    }

    public void takeDamage(int damage) {
        hp = Math.max(0,hp - damage);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public double getDropRate(double v) {
        return dropRate;
    }

    @Override
    public String toString() {
        return "Enemy: " + name +
                "\nLevel: " + level +
                "\nHP: " + hp +
                "\nDamage: " + minDamage + "-" + maxDamage;
    }
}
