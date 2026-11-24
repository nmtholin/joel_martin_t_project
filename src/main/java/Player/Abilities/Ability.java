package Player.Abilities;

public class Ability {

    public enum AbilityType {
        OFFENSIVE, DEFENSIVE
    }

    private final String name;
    private final AbilityType abilityType;
    private final int resourceCost;

    public Ability(String name, AbilityType abilityType, int resourceCost) {
        this.name = name;
        this.abilityType = abilityType;
        this.resourceCost = resourceCost;
    }

    public String getName() {
        return name;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    public AbilityType getAbilityType() {
        return abilityType;
    }

}
