import java.util.Random;

public class Aussenwelt {
    private double temperature;

    private String clouds = "cloudy";


    public Aussenwelt(String clouds) {
        this.clouds = clouds;
        Random random = new Random();
        this.temperature = random.nextDouble() * 19;
    }


    public double getTemperature() {
        return temperature;
    }

    public String getClouds() {
        return clouds;
    }
}
