import java.util.ArrayList;
import java.util.List;

public class Car {
    private String color;
    private double fuelConsumption;

    private final String SerialNumber;
    private final String brand;
    private double tankVolume;
    private double fuelAmount;

    private Engine engine;

    private List<Mirror> mirrors = new ArrayList<>();

    public Car(Engine engine, String color, double fuelConsumption, String serialNumber, String brand, double tankVolume, double fuelAmount) {
        this.engine = engine;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
        SerialNumber = serialNumber;
        this.brand = brand;
        this.tankVolume = tankVolume;
        this.fuelAmount = fuelAmount;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void drive(int speed) {
        engine.drive(speed);
        this.fuelAmount -=(fuelConsumption * speed);
        System.out.println("I am driving at speed" + speed);
    }

    public void brake() {
        System.out.println("I am breaking");
    }

    public void turboBoost() {
        double fuelAmountPercent = fuelAmount / tankVolume;
        if (fuelAmountPercent >= 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {

        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuut");
        }
    }


    public void addMirrors(Mirror mirror){
    this.mirrors.add(mirror);

    }

    public double getRemainingRange() {
        double remainingRange = fuelAmount / fuelConsumption;
        System.out.println("Remaining Range " + remainingRange + "km");
        return remainingRange;
    }

    public List<Mirror> getMirrors() {
        return mirrors;
    }
}
