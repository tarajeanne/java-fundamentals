package labs_examples.enumerations.labs;

public class Character {
    protected byte charisma;
    protected byte intelligence;
    protected byte wisdom;
    protected byte combat;
    protected int power;
    protected int precision;

    Character(CharacterClass characterClass) {
        this.charisma = (byte)(5 * (1 + (Math.random() * 10)));
        this.intelligence = (byte)(5 * (1 + (Math.random() * 10)));
        this.wisdom = (byte)(5 * (1 + (Math.random() * 10)));
        this.combat = (byte)(5 * (1 + (Math.random() * 10)));
        this.power = characterClass.getPower();
        this.precision = characterClass.getPrecision();
    }

    Character(byte charisma, byte intelligence, byte wisdom, byte combat, CharacterClass characterClass) {
        this.charisma = charisma;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.combat = combat;
        this.power = characterClass.getPower();
        this.precision = characterClass.getPrecision();
    }

    public byte getCharisma() {
        return charisma;
    }

    public void setCharisma(byte charisma) {
        this.charisma = charisma;
    }

    public byte getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(byte intelligence) {
        this.intelligence = intelligence;
    }

    public byte getWisdom() {
        return wisdom;
    }

    public void setWisdom(byte wisdom) {
        this.wisdom = wisdom;
    }

    public byte getCombat() {
        return combat;
    }

    public void setCombat(byte combat) {
        this.combat = combat;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public static void main(String[] args) {
        Character Katara = new Character(CharacterClass.WATER);
        System.out.println("Charisma: " + Katara.getCharisma());
        System.out.println("Power: " + Katara.getPower());
    }
}
