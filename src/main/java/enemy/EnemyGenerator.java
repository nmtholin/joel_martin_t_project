package enemy;

public class EnemyGenerator {

    public static Enemy create(int level, int killed) {
        switch (killed) {
            case 0, 1, 2 -> {
                switch (level) {
                    case 1 -> {
                        return createImp();
                    }
                    case 2 -> {
                        return createSkeletonWarrior();
                    }
                    case 3 -> {
                        return createMinotaur();
                    }
                }
            }
            case 3 -> {
                switch (level) {
                    case 1 -> {
                        return createImpBoss();
                    }
                    case 2 -> {
                        return createSkeletonBoss();
                    }
                    case 3 -> {
                        return createMinotaurBoss();
                    }
                }
            }
        }
        return null;
    }

    public static NormalEnemy createImp() {
        return new NormalEnemy("Imp", 25, 1, 5, 10);
    }

    public static NormalEnemy createSkeletonWarrior() {
        return new NormalEnemy("Skeleton Warrior", 50, 2, 10, 15);
    }

    public static NormalEnemy createMinotaur() {
        return new NormalEnemy("Minotaur", 80, 3, 20, 25);
    }

    public static Boss createImpBoss() {
        return new Boss
                ("Sven, Lord of (s)Imps", 75, 1, 10, 20, 5);
    }

    public static Boss createSkeletonBoss() {
        return new Boss
                ("Skeletor", 100, 2, 15, 24, 6);
    }

    public static Boss createMinotaurBoss() {
        return new Boss
                ("Beastman", 125, 3, 20, 28, 7);
    }

/*
Create with:
 NormanEnemy imp1 = EnemyGenerator.createImp();
 Boss boss3 = EnemeyGenerator.createMinotaurBoss();
*/
}
