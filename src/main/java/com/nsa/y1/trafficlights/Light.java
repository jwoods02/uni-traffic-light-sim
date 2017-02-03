package com.nsa.y1.trafficlights;

/**
 * Represents a single light.  It has a shape (round, arrow, etc) and a colour.
 */
public class Light {

    private Shape theShape;
    private Colour theColour;
    private boolean isOn;


    public Light() {
        this(Shape.CIRCLE, Colour.RED);
    }

    /**
     * Create a Light from a given colour and shape.
     */
    public Light(Shape aShape, Colour aColour) {
        if (aShape == null) {
            aShape = Shape.CIRCLE;
        }
        if (aColour == null) {
            aColour = Colour.RED;
        }
        theShape = aShape;
        theColour = aColour;
        isOn = false;
    }


    public Shape getShape() {
        return theShape;
    }

    public Colour getColour() {
        return theColour;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Light light = (Light) o;

        if (theShape != light.theShape) {
            return false;
        }
        return theColour == light.theColour;
    }

    @Override
    public int hashCode() {
        int result = theShape.hashCode();
        result = 31 * result + theColour.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Light{" +
                "theShape=" + theShape +
                ", theColour=" + theColour +
                ", isOn=" + isOn +
                '}';
    }
}
