package net.luramaya.anotherCar;

public class main {
    public static void main(String[] args) {

        Engine ngix = new Engine(Engine.Type.DIESEL, 10000);
        Producer lidl = new Producer("lidl", "Russia", 0.30);
        Car celvin = new Car("blue", 20.09, 299999.99, 30,lidl,ngix);
        celvin.drive(10);

    }
}
