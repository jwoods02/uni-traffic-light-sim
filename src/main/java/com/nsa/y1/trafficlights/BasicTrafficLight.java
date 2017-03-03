package com.nsa.y1.trafficlights;

/**
 * Created by James on 02/03/2017.
 *
 * Represents a simple traffic light, with circular red, amber and green lights and their related transitions.
 */
public class BasicTrafficLight {
    private Light redLight;
    private Light amberLight;
    private Light greenLight;

    public BasicTrafficLight() {
        redLight = new Light(Shape.CIRCLE, Colour.RED);
        amberLight = new Light(Shape.CIRCLE, Colour.AMBER);
        greenLight = new Light(Shape.CIRCLE, Colour.GREEN);
    }

    public String getRedLightState() {
        if (this.redLight.isOn()) {
            return "On";
        } else {
            return "Off";
        }
    }

    public void setRedLightState(String changeState) {
        if ( changeState.equals("On") ) {
            this.redLight.turnOn();
        } else if ( changeState.equals("Off") ) {
            this.redLight.turnOff();
        }
    }

    public String getAmberLightState() {
        if (this.amberLight.isOn()) {
            return "On";
        } else {
            return "Off";
        }
    }

    public void setAmberLightState(String changeState) {
        if ( changeState.equals("On") ) {
            this.amberLight.turnOn();
        } else if ( changeState.equals("Off") ) {
            this.amberLight.turnOff();
        }

    }

    public String getGreenLightState() {
        if (this.greenLight.isOn()) {
            return "On";
        } else {
            return "Off";
        }
    }

    public void setGreenLightState(String changeState) {
        if ( changeState.equals("On") ) {
            this.greenLight.turnOn();
        } else if ( changeState.equals("Off") ) {
            this.greenLight.turnOff();
        }

    }

}
