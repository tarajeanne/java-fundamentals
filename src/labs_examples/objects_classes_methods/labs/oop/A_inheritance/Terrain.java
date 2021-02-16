package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Terrain {
    protected byte air;
    protected byte water;
    protected byte earth;
    protected byte fire;

    public Terrain(byte air, byte water, byte earth, byte fire) throws Exception {
        if ((air + water + earth + fire) == 100) {
            this.air = air;
            this.earth = earth;
            this.water = water;
            this.fire = fire;
        }
        else {
            throw new Exception();
        }
    }
}
