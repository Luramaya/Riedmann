import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sonnenkolektor {
    private double voltage;
    private Aussenwelt aussenwelt;

    private List<VoltageObserver> observerList = new ArrayList<>();

    public Sonnenkolektor(Aussenwelt aussenwelt) {

        this.aussenwelt = aussenwelt;
    }

    public void syncData() {
        double multiplier = 1;

        if (Objects.equals(aussenwelt.getClouds(), "cloudy")) {
            multiplier = 0.5;
        } else if (Objects.equals(aussenwelt.getClouds(), "sunny af")) {
            multiplier = 1.2;
        }
        this.setVoltage(aussenwelt.getTemperature() * multiplier);
    }

    public void addObserver(VoltageObserver observer) {
        observerList.add(observer);
    }


    public void setVoltage(double voltage) {
        this.voltage = voltage;
        if (this.voltage >= 18) {
            for (VoltageObserver voltageObserver : observerList) {
                voltageObserver.inform();
            }
        }
    }

    public double getVoltage() {
        return voltage;
    }

    public Aussenwelt getAussenwelt() {
        return aussenwelt;
    }
}
