package player.equipment;

public class Weapon {
    public enum WeaponType {
        MELEE, CASTER
    }
    private final int minDamage;
    private final int maxDamage;
    private final int level;
    private final WeaponType weaponType;
    private final int resourceIncrease;

    public Weapon(WeaponType type, int level) {
        weaponType = type;
        this.level = level;
        resourceIncrease = 5 * level;
        minDamage = 5 * level;
        maxDamage = minDamage * 2;
    }

    public WeaponType getWeaponType() {
        return weaponType;
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

    public int getResourceIncrease() {
        return resourceIncrease;
    }
}
