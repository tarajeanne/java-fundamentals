package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
import java.util.ArrayList;
import java.util.Arrays;

public class PartyMember extends Character{
    protected ArrayList<Relationship> bonds = new ArrayList<Relationship>();

    public PartyMember(byte charisma, byte intelligence, byte wisdom, byte combat, Relationship...bonds) {
        super(charisma, intelligence, wisdom, combat);
        this.bonds.addAll(Arrays.asList(bonds));
    }

    public boolean fight(Character opponent) {
        byte opponentScore = (byte)((Math.random() * 20) + 1 + opponent.combat);
        byte myScore = (byte)((Math.random() * 20) + 1 + this.combat);
        return myScore >= opponentScore;
    }
}
