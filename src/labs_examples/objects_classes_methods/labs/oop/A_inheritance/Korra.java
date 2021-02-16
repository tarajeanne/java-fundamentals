package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Korra extends PartyMember{
    protected byte praise;

    public Korra(byte charisma, byte intelligence, byte wisdom, byte praise, byte combat, Relationship... bonds) {
        super(charisma, intelligence, wisdom, combat, bonds);
        this.praise = praise;
    }

    @Override
    public boolean fight(Character opponent) {
        byte opponentScore = (byte)((Math.random() * 20) + 1 + opponent.combat);
        byte myScore = (byte)((Math.random() * 20) + 1 + this.combat);
        //invoke avatar state
        if (opponentScore > myScore) {
            myScore +=(byte)((Math.random() * 20) + 1);
        }
        return myScore >= opponentScore;
    }
}
