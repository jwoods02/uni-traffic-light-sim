package com.nsa.y1.trafficlights.lights;

import static org.junit.Assert.*;

import com.nsa.y1.trafficlights.lights.Colour;
import com.nsa.y1.trafficlights.lights.Light;
import com.nsa.y1.trafficlights.lights.Shape;
import org.junit.Before;
import org.junit.Test;


/**
 * Test the basic operation of a light.
 */
public class LightTest {

    private Light redCircleLight;
    private Light amberCircleLight;
    private Light greenRightLight;

    @Before
    public void createLights() throws Exception {
        redCircleLight = new Light(); //test default constructor
        amberCircleLight = new Light(Shape.CIRCLE, Colour.AMBER);
        greenRightLight = new Light(Shape.RIGHT_ARROW, Colour.GREEN);
    }

    @Test
    public void defaultLightIsRedAndCircular() throws Exception {
        Light testRedCircleLight = new Light(Shape.CIRCLE, Colour.RED);
        assertEquals(redCircleLight, testRedCircleLight);
    }

    @Test
    public void gettersReturnFields() throws Exception {
        assertEquals(Colour.GREEN, greenRightLight.getColour());
        assertEquals(Shape.RIGHT_ARROW, greenRightLight.getShape());
        assertFalse(greenRightLight.isOn());
    }

    @Test
    public void toStringIsCorrect() {
        assertEquals("Light{theShape=CIRCLE, theColour=AMBER, isOn=false}", amberCircleLight.toString());
    }
}
