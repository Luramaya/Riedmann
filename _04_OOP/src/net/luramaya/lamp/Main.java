package net.luramaya.lamp;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        GlowElement element1 = new GlowElement("Element One", "red");
        GlowElement element2 = new GlowElement("Element Two", "blue");

        lamp.addGlowElement(element1);
        lamp.addGlowElement(element2);

        lamp.printNamesOfLightElements();
        lamp.turnAllOn();
        lamp.getOverallPowerUsage();
        lamp.turnAllOn();

    }
}
