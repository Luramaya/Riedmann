package net.luramaya.remote;

public class Battery {
    public int status = 100;

    public void turnOn() {
        status -= 5;
        System.out.println("Verbraucher angeschlossen");
    }
    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }
}
