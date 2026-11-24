package enemy;

public class Boss extends Enemy{
    private int specialAttack;

    public Boss(String name, int hp, int level, int minDamage, int maxDamage, int specialAttack) {
        super(name, hp, level, minDamage, maxDamage, 1);
        this.specialAttack = specialAttack;
    }

    @Override
    public int enemyAttack() {
        return super.enemyAttack() + specialAttack;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }
}
