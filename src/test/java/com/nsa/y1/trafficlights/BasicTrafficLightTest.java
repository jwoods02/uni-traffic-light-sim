package com.nsa.y1.trafficlights;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by James on 02/03/2017.
 *
 * Test basic operation of a basic traffic light.
 */
public class BasicTrafficLightTest {
    private Light redCircleLight;
    private Light amberCircleLight;
    private Light greenCircleLight;
    private BasicTrafficLight TrafficLightOne;

    @Before
    public void createTrafficLight() throws Exception {
        TrafficLightOne = new BasicTrafficLight();
    }

    @Test
    public void defaultTrafficLightConstructorAndGetters() throws Exception {
        assertEquals(TrafficLightOne.getRedLightState(), "Off");
        assertEquals(TrafficLightOne.getAmberLightState(), "Off");
        assertEquals(TrafficLightOne.getGreenLightState(), "Off");
    }
    @Test
    public void defaultTrafficLightSetters() throws Exception {
        TrafficLightOne.setRedLightState("On");
        assertEquals(TrafficLightOne.getRedLightState(), "On");

        TrafficLightOne.setAmberLightState("On");
        assertEquals(TrafficLightOne.getAmberLightState(), "On");

        TrafficLightOne.setGreenLightState("On");
        assertEquals(TrafficLightOne.getGreenLightState(), "On");
    }


}
