public class Main {
    public static void main(String[] args) {

        Aussenwelt cloudy = new Aussenwelt("cloudy");
        Aussenwelt sunny = new Aussenwelt("sunny af");
        Aussenwelt regen = new Aussenwelt("regen");

        Sonnenkolektor sonni = new Sonnenkolektor(sunny);
        sonni.addObserver(new Heizung());
        sonni.addObserver(new Geschirrspueler());
        sonni.addObserver(new Laderegler());

        sonni.syncData();

        System.out.println("Wetter ist " + sonni.getAussenwelt().getClouds() + ". Es werden " + sonni.getVoltage() + " ausgegeben.");
    }
}
