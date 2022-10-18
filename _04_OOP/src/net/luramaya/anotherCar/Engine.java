package net.luramaya.anotherCar;

public class Engine {
    public enum Type{DIESEL, GAS}
    private Type engineType;
    private double duckPower;

    public Engine(Type engineType, double duckPower) {
        this.engineType = engineType;
        this.duckPower = duckPower;
    }
}
