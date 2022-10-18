package net.luramaya.remote;

import java.rmi.server.RemoteObjectInvocationHandler;

public class Main {
    public static void main(String[] args) {

        Battery bob = new Battery();
        Battery kevin = new Battery();
        Remote remus = new Remote("athrazit", "Samsung");
        remus.setBatteryOne(bob);
        remus.setBatteryTwo(kevin);

        for (int i = 0; i < 21; i++) {
            remus.turnOn();
            remus.turnOff();
        }
        System.out.println("Battery status: " + remus.getStatus());

    }
}
