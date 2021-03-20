package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

public enum CharacterClass {
    FIRE(1, 1),
    EARTH(2, 0),
    WATER(1, 1),
    AIR(0, 2),
    WEAPONS(1, 1),
    BARB(2, 0),
    CHIBLOCKER(0, 2);
    private final int power;
    private final int precision;
    CharacterClass(int power, int precision){
        this.power = power;
        this.precision = precision;
    }
    public int getPower() {
        return this.power;
    }
    public int getPrecision() {
        return precision;
    }
}

