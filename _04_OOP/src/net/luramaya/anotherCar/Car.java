package net.luramaya.anotherCar;

public class Car {
    private String color;
    private double maxSpeed;
    private double basePrice;
    private double baseConsume;
    private Producer producer;
    private Engine engine;

    private double mileage;
    private double price;

    public Car(String color, double maxSpeed, double basePrice, double baseConsume, Producer producer, Engine engine) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsume = baseConsume;
        this.producer = producer;
        this.engine = engine;

        this.price = ( 1 - this.producer.getRabatt()) * this.basePrice;
        }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Producer getProducer() {
        return producer;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public double getConsume() {
        if(this.mileage<=50000){
            return this.baseConsume;
        }else {
            return (this.baseConsume * 109.8);
        }
    }

    public void drive(int kilometres){
        System.out.println("BRUMM BRUMM DIESEL AUTOS SIND DUMM");
        this.mileage+= kilometres;
    }
}
