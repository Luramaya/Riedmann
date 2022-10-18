package net.luramaya.remote;

public class Remote {
    private String color;
    private String brand;
    private Battery batteryOne;
    private Battery batteryTwo;

    public Remote(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public Battery getBatteryOne() {
        return batteryOne;
    }

    public void setBatteryOne(Battery batteryOne) {
        this.batteryOne = batteryOne;
    }

    public Battery getBatteryTwo() {
        return batteryTwo;
    }

    public void setBatteryTwo(Battery batteryTwo) {
        this.batteryTwo = batteryTwo;
    }

    public int getStatus(){
        int avg = (batteryOne.status+ batteryTwo.status)/2;
        return avg;
    }

    public void turnOn(){
        if(this.getStatus()>= 10) {
            batteryOne.turnOn();
            batteryTwo.turnOn();
        }else{
            System.out.println("\uD83E\uDEAB Battery too low");
        }
    }

    public void turnOff(){
        batteryOne.turnOff();
        batteryTwo.turnOff();
    }

}
