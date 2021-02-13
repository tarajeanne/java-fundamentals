package labs_examples.objects_classes_methods.labs.objects;

class Cabin {
    private int firstClassSeats;
    private int economySeats;

    public int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    public void setFirstClassSeats(int seats) {
        this.firstClassSeats = seats;
    }

    public int getEconomySeats() {
        return this.economySeats;
    }

    public void setEconomySeats(int seats) {
        this.economySeats = seats;
    }

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
    private double length;
    private double width;

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

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
    private double capacity;
    private boolean temperatureControlled;

    public double getCapacity() {
        return this.capacity;
    }

    public boolean getTemperatureControlled() {
        return this.temperatureControlled;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setTemperatureControlled(boolean temperatureControlled) {
        this.temperatureControlled = temperatureControlled;
    }

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
    private int pilotsRequired;
    private boolean hasAutoPilot;

    public int getPilotsRequired() {
        return pilotsRequired;
    }

    public boolean isHasAutoPilot() {
        return hasAutoPilot;
    }

    public void setPilotsRequired(int pilotsRequired) {
        this.pilotsRequired = pilotsRequired;
    }

    public void setHasAutoPilot(boolean hasAutoPilot) {
        this.hasAutoPilot = hasAutoPilot;
    }

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

public class Airplane {
    Cabin cabin;
    Wing wing;
    Cockpit cockpit;
    CargoHold cargoHold;
    double fuelCapacity;
    double currentFuel;

    public Cabin getCabin() {
        return cabin;
    }

    public void setCabin(Cabin cabin) {
        this.cabin = cabin;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }

    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public CargoHold getCargoHold() {
        return cargoHold;
    }

    public void setCargoHold(CargoHold cargoHold) {
        this.cargoHold = cargoHold;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

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

