package net.luramaya.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {

    private List<GlowElement> glowElements = new ArrayList<>();

    public void addGlowElement(GlowElement glowElement) {
        glowElements.add(glowElement);
    }

    public void turnAllOn() {
        for (GlowElement element : glowElements) {
            element.turnOn();
        }
    }

    public double getOverallPowerUsage() {
        double conSum = 0;
        for (GlowElement element : glowElements) {
            conSum += element.getPowerConsumption();
        }
        return conSum;
    }

    public void printNamesOfLightElements() {
        int num = 1;
        for (GlowElement element : glowElements) {
            var name = element.getName();
            System.out.println(num + ". Element " + name);
            num++;
        }
    }


}
