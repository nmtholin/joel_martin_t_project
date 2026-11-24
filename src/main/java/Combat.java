import enemy.Enemy;
import player.PlayerClass;
import player.abilities.Ability;

public class Combat {

    public void playerAttack(Enemy target, Ability ability) {
        ability.cast(target);
    }

    public void enemyAttack(Enemy enemy, PlayerClass player) {
        int damage = enemy.enemyAttack();
        System.out.printf("%s attacks %s for %d damage%n", enemy.getName(), player.getName(), damage);
        player.takeDamage(damage);
    }

}
