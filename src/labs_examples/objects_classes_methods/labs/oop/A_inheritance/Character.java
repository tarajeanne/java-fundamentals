package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Character {
    protected byte charisma;
    protected byte intelligence;
    protected byte wisdom;
    protected byte combat;

    Character() {
        this.charisma = (byte)(5 * (1 + (Math.random() * 10)));
        this.intelligence = (byte)(5 * (1 + (Math.random() * 10)));
        this.wisdom = (byte)(5 * (1 + (Math.random() * 10)));
        this.combat = (byte)(5 * (1 + (Math.random() * 10)));
    }

    Character(byte charisma, byte intelligence, byte wisdom, byte combat) {
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.combat = combat;
    }
}
