package player.abilities.mage;

import player.abilities.Ability;
import player.Mage;
import java.util.random.RandomGenerator;

public class FrostArmor extends Ability {

    private final int minDamageReduction;
    private final int maxDamageReduction;
    private final Mage player;

    public FrostArmor(Mage player) {
        super("Frost Armor", AbilityType.DEFENSIVE, 20);
        this.player = player;
        minDamageReduction = 10;
        maxDamageReduction = 20;
    }

    @Override
    public void cast() {
        int random = RandomGenerator.getDefault().nextInt(minDamageReduction, maxDamageReduction + 1);
        player.setDamageReduction(random);
    }
}
