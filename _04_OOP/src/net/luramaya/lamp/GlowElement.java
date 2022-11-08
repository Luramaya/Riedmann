package net.luramaya.lamp;

public class GlowElement {
    private final String name;
    private final String color;
    private double powerConsumption;
    private boolean status = false;

    public GlowElement(String name, String color) {
        this.name = name;
        this.color = color;
    }


    public void turnOn() {
        if (this.status) {
            System.out.println("Mein name ist " + this.name + " und ich bin bereits eingeschalten");
        } else {
            this.status = true;
            this.powerConsumption += 5;
        }
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
