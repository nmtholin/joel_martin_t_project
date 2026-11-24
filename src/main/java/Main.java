import enemy.Enemy;
import enemy.EnemyGenerator;
import enemy.NormalEnemy;
import player.Mage;
import player.PlayerClass;
import player.Warrior;

import java.util.Scanner;

public class Main {

    void main() {

        try (Scanner scanner = new Scanner(System.in)) {
            int level = 1;
            System.out.printf("Entering level %d%n", level);
            mainLoop:
            while (true) {

                PlayerClass player = new Mage("mage");
                //            PlayerClass player = createPlayer(scanner);

                Combat combat = new Combat();
                Enemy enemy = EnemyGenerator.createImp();
                System.out.printf("You encounter a %s%n", enemy.getName());

                encounterLoop:
                while (true) {

                    chooseActionLoop:
                    while (true) {

                        System.out.printf("1. %s%n", player.getOffensiveAbility().getName());
                        System.out.printf("2. %s%n", player.getDefensiveAbility().getName());
                        System.out.println("3. Give up");
                        System.out.print("Choose: ");

                        switch (scanner.nextLine()) {
                            case "1" -> {
                                combat.playerAttack(enemy, player.getOffensiveAbility());
                                break chooseActionLoop;
                            }
                            case "2" -> {
                                player.getDefensiveAbility().cast();
                                break chooseActionLoop;
                            }
                            case "3" -> {
                                break mainLoop;
                            }
                            default -> {
                                System.out.println("Invalid option");
                            }
                        }
                    }


                    if (enemy.isAlive()) {
                        combat.enemyAttack(enemy, player);
                    } else {
                        turnRecap(player, enemy);
                        break;
                    }

                    if (!player.isAlive()) {
                        System.out.println("You died. Git gud");
                        break mainLoop;
                    }

                    turnRecap(player, enemy);
                }
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
        if (!enemy.isAlive()) {
            System.out.printf("%s has died%n", enemy.getName());
        } else {
            System.out.printf("%s has %d health left%n", enemy.getName(), enemy.getHp());
        }
        System.out.printf("%s has %d health left%n", player.getName(), player.getHealthPoints());
    }
}
