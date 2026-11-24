package player.equipment;

public class Armor {

    public enum ArmorType {
        PLATE, CLOTH
    }

    private int healthIncrease = 0;
    private final ArmorType armorType;
    private final int level;

    public Armor(ArmorType type, int level) {
        armorType = type;
        this.level = level;
        if (type ==  ArmorType.CLOTH) {
            healthIncrease = 10 * level;
        } else if (type == ArmorType.PLATE) {
            healthIncrease = 20 * level;
        }

    }

    public int getHealthIncrease() {
        return healthIncrease;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public int getLevel() {
        return level;
    }

}
