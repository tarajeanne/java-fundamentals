package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {
    public static void main (String[] args) {
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
    }

}

    class Cabin {
        int firstClassSeats;
        int economySeats;

        public Cabin(int seats) {
            this.economySeats = seats;
            this.firstClassSeats = 0;
        }

        public Cabin(int firstClassSeats, int economySeats) {
            this.economySeats = economySeats;
            this.firstClassSeats = firstClassSeats;
        }

        @Override
        public String toString() {
            return "Cabin{" +
                    "firstClassSeats=" + firstClassSeats +
                    ", economySeats=" + economySeats +
                    '}';
        }
    }

    class Wing {
        double length;
        double width;

        public Wing(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public String toString() {
            return "Wing{" +
                    "length=" + length +
                    ", width=" + width +
                    '}';
        }
    }

    class CargoHold {
        double capacity;
        boolean temperatureControlled;

        public CargoHold(double capacity) {
            this.capacity = capacity;
            this.temperatureControlled = false;
        }

        public CargoHold(double capacity, boolean temperatureControlled) {
            this.capacity = capacity;
            this.temperatureControlled = temperatureControlled;
        }

        @Override
        public String toString() {
            return "CargoHold{" +
                    "capacity=" + capacity +
                    ", temperatureControlled=" + temperatureControlled +
                    '}';
        }
    }

    class Cockpit {
        int pilotsRequired;
        boolean hasAutoPilot;

        public Cockpit(int pilotsRequired) {
            this.pilotsRequired = pilotsRequired;
            this.hasAutoPilot = false;
        }

        public Cockpit(int pilotsRequired, boolean hasAutoPilot) {
            this.pilotsRequired = pilotsRequired;
            this.hasAutoPilot = hasAutoPilot;
        }

        @Override
        public String toString() {
            return "Cockpit{" +
                    "pilotsRequired=" + pilotsRequired +
                    ", hasAutoPilot=" + hasAutoPilot +
                    '}';
        }
    }

    class Airplane {
        Cabin cabin;
        Wing wing;
        Cockpit cockpit;
        CargoHold cargoHold;
        double fuelCapacity;
        double currentFuel;

        public Airplane(Cabin cabin, Wing wing, Cockpit cockpit, CargoHold cargoHold, double fuelCapacity) {
            this.cabin = cabin;
            this.wing = wing;
            this.cockpit = cockpit;
            this.cargoHold = cargoHold;
            this.fuelCapacity = fuelCapacity;
            this.currentFuel = fuelCapacity;
        }

        public double fly(int miles) {
            this.currentFuel -= (.05 * miles);
            return this.currentFuel;
        }

        @Override
        public String toString() {
            return "Airplane{" +
                    "cabin=" + cabin +
                    ", wing=" + wing +
                    ", cockpit=" + cockpit +
                    ", cargoHold=" + cargoHold +
                    ", fuelCapacity=" + fuelCapacity +
                    ", currentFuel=" + currentFuel +
                    '}';
        }
    }

