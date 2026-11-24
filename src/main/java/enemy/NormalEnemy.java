package enemy;

public class NormalEnemy extends Enemy {

    public NormalEnemy(String name, int hp, int level, int minDamage, int maxDamage) {
        super(name, hp, level, minDamage, maxDamage,     0.25);
    }
}
