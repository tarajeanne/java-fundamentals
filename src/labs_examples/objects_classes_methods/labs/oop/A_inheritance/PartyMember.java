package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
import java.util.ArrayList;

public class PartyMember extends Character{
    protected ArrayList<Relationship> bonds = new ArrayList<Relationship>();

    public PartyMember(byte charisma, byte intelligence, byte wisdom, Relationship...bonds) {
        super(charisma, intelligence, wisdom);
        for (Relationship i: bonds) {
            this.bonds.add(i);
        }
    }
}
