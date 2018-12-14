package com.OO;

public class Lamp {

    private int colorTemperature;
    private Shade shade;
    private boolean on;

    public Lamp() {
        this(2000, new Shade(), false);
    }

    public Lamp(int colorTemperature, Shade shade, boolean on) {
        this.colorTemperature = colorTemperature;
        this.shade = shade;
    }


    public void turnOn(){
        getShade().lightPenetration();
    }

    public Shade getShade() {
        return shade;
    }
}
