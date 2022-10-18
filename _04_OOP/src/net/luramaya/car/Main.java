package net.luramaya.car;

public class Main {
    public static void main(String[] args) {

        Engine x = new Engine(2100, Engine.TYPE.GAS);
        Car kevin = new Car(x, "blue", 2, "Marcel D'Avis 1234", "Fesla", 300, 40);
        kevin.drive(1);
        kevin.honk(2);
        kevin.brake();
        kevin.turboBoost();
        Mirror rearMirror = new Mirror(Mirror.POSITION.REAR, 2);
        Mirror leftMirror = new Mirror(Mirror.POSITION.LEFT, 1);
        Mirror rightMirror = new Mirror(Mirror.POSITION.RIGHT, 10);
        kevin.addMirrors(rearMirror);
        kevin.addMirrors(leftMirror);
        kevin.addMirrors(rightMirror);
        kevin.getMirrors().get(0).toggleFold();

    }
}