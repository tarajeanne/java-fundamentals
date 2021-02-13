package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneController {
    public static void main(String[] args) {
        Cabin cabin1 = new Cabin(120);
        Cabin cabin2 = new Cabin(50, 200);
        Wing wing = new Wing(250, 50);
        CargoHold cargoHold1 = new CargoHold(700);
        CargoHold cargoHold2 = new CargoHold(700, true);
        Cockpit cockpit = new Cockpit(2, true);
        Airplane simplePlane = new Airplane(cabin1, wing, cockpit, cargoHold1, 1000);
        Airplane fancyPlane = new Airplane(cabin2, wing, cockpit, cargoHold2, 1250);
        System.out.println(simplePlane.fly(100));
        System.out.println(fancyPlane.fly(100));
        System.out.println("Simple plane:" + simplePlane);
        System.out.println("Fancy plane:" + fancyPlane);

        fancyPlane.setCabin(cabin1);
        System.out.println("Not so fancy now, huh?" + fancyPlane);
    }

}

