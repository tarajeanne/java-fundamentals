package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Relationship {
    private float bond;
    private float coordination;

    public Relationship(float bond, float coordination) {
        this.bond = bond;
        this.coordination = coordination;
    }

    public float getBond() {
        return bond;
    }

    public void setBond(float bond) {
        this.bond = bond;
    }

    public float getCoordination() {
        return coordination;
    }

    public void setCoordination(float coordination) {
        this.coordination = coordination;
    }
}
