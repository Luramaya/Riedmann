package net.luramaya.car;

public class Truck extends Car {

    boolean hasTrailer = false;

    public Truck(Engine engine, String color, double fuelConsumption, String serialNumber, String brand, double tankVolume, double fuelAmount, boolean hasTrailer) {
        super(engine, color, fuelConsumption, serialNumber, brand, tankVolume, fuelAmount);
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
}
