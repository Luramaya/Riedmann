package net.luramaya.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {

    private List<GlowElement> glowElements = new ArrayList<>();

    public void addGlowElement(GlowElement glowElement){
        glowElements.add(glowElement);
    }
    public void turnAllOn(){
        for (GlowElement element:glowElements
             ) {
            element.turnOn();
        }
    }
}
