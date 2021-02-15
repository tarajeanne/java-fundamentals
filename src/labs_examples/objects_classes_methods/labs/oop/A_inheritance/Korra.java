package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Korra extends PartyMember{
    protected byte praise;

    public Korra(byte charisma, byte intelligence, byte wisdom, byte praise, Relationship... bonds) {
        super(charisma, intelligence, wisdom, bonds);
        this.praise = praise;
    }
}
