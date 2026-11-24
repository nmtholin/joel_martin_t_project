import enemy.Enemy;
import enemy.EnemyGenerator;
import enemy.NormalEnemy;
import player.Mage;
import player.PlayerClass;
import player.Warrior;

import java.util.Scanner;

public class Main {

    void main() {

        int level = 1;

        try (Scanner scanner = new Scanner(System.in)) {
            PlayerClass player = new Warrior("w");
//            PlayerClass player = createPlayer(scanner);

            while (true) {
                System.out.printf("Entering level %d%n", level);
                Enemy enemy = EnemyGenerator.createImp();
                System.out.printf("You encounter a %s%n", enemy.getName());
                System.out.printf("1. %s%n", player.getOffensiveAbility().getName());
                System.out.printf("2. %s%n", player.getDefensiveAbility().getName());
                System.out.println("3. Give up");



            }
        }
    }

    public PlayerClass createPlayer(Scanner scanner) {
        String name;
        while (true) {
            System.out.print("Choose name: ");
            name = scanner.nextLine();
            if (name.isBlank()) {
                System.out.println("Name can not be blank");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("1. Warrior");
            System.out.println("2. Mage");
            System.out.print("Choose class: ");
            switch (scanner.nextLine()) {
                case "1" -> {
                    return new Warrior(name);
                }
                case "2" -> {
                    return new Mage(name);
                }
                default -> {
                    System.out.println("Invalid option");
                }
            }
        }
    }

    public void turnRecap(PlayerClass player, Enemy enemy) {
        System.out.printf("%s has %d health left%n", enemy.getName(), enemy.getHp());
        System.out.printf("%s has %d health left%n", player.getName(), player.getHealthPoints());
    }
}
