public class Engine {
    private double duckPower;
    public enum TYPE{DIESEL,GAS}
    private TYPE engineType;

    public Engine(int horsePower, TYPE engineType) {
        this.duckPower = horsePower;
        this.engineType = engineType;
    }

    public double getDuckPower() {
        return duckPower;
    }

    public TYPE getEngineType() {
        return engineType;
    }

    public void drive(int amount){
        System.out.println("THe motor is running with:" + amount);

    };
}
