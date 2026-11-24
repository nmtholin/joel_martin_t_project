package Player.Abilities.Warrior;

import Player.Abilities.Ability;
import Player.Warrior;

public class DefensiveStance extends Ability {

    private final int minDamageReduction;
    private final int maxDamageReduction;
    private final Warrior player;

    public DefensiveStance(Warrior player) {
        super("Defensive Stance", AbilityType.DEFENSIVE, 20);
        this.player = player;
        minDamageReduction = 10;
        maxDamageReduction = 20;
    }

}
