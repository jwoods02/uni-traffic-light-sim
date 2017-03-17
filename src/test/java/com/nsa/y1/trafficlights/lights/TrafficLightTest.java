package com.nsa.y1.trafficlights.lights;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by James on 03/03/2017.
 */

// Mock class to test abstract class methods
class TrafficLightTester extends TrafficLight {

}


public class TrafficLightTest {

    private TrafficLight trafficLightTester;

    @Before
    public void createTrafficLightTester() throws Exception {
        trafficLightTester = new TrafficLightTester();
    }

    @Test
    public void getLightStates() throws Exception {
        assertEquals(trafficLightTester.getRedLightState(), "Off");
        assertEquals(trafficLightTester.getAmberLightState(), "Off");
        assertEquals(trafficLightTester.getGreenLightState(), "Off");
    }

    @Test
    public void changingLightStates() throws Exception {
        trafficLightTester.setRedLightOn(true);
        assertEquals(trafficLightTester.getRedLightState(), "On");
        trafficLightTester.setAmberLightOn(true);
        assertEquals(trafficLightTester.getAmberLightState(), "On");
        trafficLightTester.setGreenLightOn(true);
        assertEquals(trafficLightTester.getGreenLightState(), "On");

        trafficLightTester.setRedLightOn(false);
        assertEquals(trafficLightTester.getRedLightState(), "Off");
        trafficLightTester.setAmberLightOn(false);
        assertEquals(trafficLightTester.getAmberLightState(), "Off");
        trafficLightTester.setGreenLightOn(false);
        assertEquals(trafficLightTester.getGreenLightState(), "Off");
    }

    @Test
    public void lightPhases() throws Exception {
        assertEquals(trafficLightTester.currentPhase(), Phase.UNKNOWN);

        trafficLightTester.setRedLightOn(true);
        assertEquals(trafficLightTester.currentPhase(), Phase.ALL_STOP);

        trafficLightTester.setAmberLightOn(true);
        assertEquals(trafficLightTester.currentPhase(), Phase.TRANSITIONING);

        trafficLightTester.setRedLightOn(false);
        trafficLightTester.setAmberLightOn(false);
        trafficLightTester.setGreenLightOn(true);
        assertEquals(trafficLightTester.currentPhase(), Phase.ALL_GO);


    }


}
