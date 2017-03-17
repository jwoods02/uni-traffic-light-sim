package com.nsa.y1.trafficlights.lights;

/**
 * Created by James on 02/03/2017.
 *
 * Represents a simple traffic light, with circular red, amber and green lights and their related transitions.
 */
public abstract class TrafficLight {
    private Light redLight;
    private Light amberLight;
    private Light greenLight;

    public TrafficLight() {
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

    public void setRedLightOn(boolean isOn) {
        if ( isOn ) {
            this.redLight.turnOn();
        } else {
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

    public void setAmberLightOn(boolean isOn) {
        if ( isOn ) {
            this.amberLight.turnOn();
        } else {
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

    public void setGreenLightOn(boolean isOn) {
        if ( isOn ) {
            this.greenLight.turnOn();
        } else {
            this.greenLight.turnOff();
        }

    }

    public Phase currentPhase() {
        if ( getAmberLightState().equals("On") ) {
            return Phase.TRANSITIONING;
        }
        else if ( getRedLightState().equals("On") ) {
            return Phase.ALL_STOP;
        }
        else if ( getGreenLightState().equals("On") ) {
            return Phase.ALL_GO;
        }
        else {
            return Phase.UNKNOWN;
        }
    }

    public void transitionMainLightsToGo(){

    }


    public void transitionMainLightsToStop(){

    }

}
