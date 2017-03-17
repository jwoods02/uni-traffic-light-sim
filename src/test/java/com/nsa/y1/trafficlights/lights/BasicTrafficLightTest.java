package com.nsa.y1.trafficlights.lights;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by James on 04/03/2017.
 */
public class BasicTrafficLightTest {

    private TrafficLight basicTrafficLight;

    @Before
    public void createBasicTrafficLight() throws Exception {
        basicTrafficLight = new BasicTrafficLight();
    }

    @Test
    public void trafficLightTransitions() throws Exception {

        basicTrafficLight.setRedLightOn(false);
        assertEquals(basicTrafficLight.currentPhase(), Phase.UNKNOWN);

        basicTrafficLight.transitionMainLightsToGo();
        assertEquals(basicTrafficLight.currentPhase(), Phase.ALL_GO);

        basicTrafficLight.transitionMainLightsToStop();
        assertEquals(basicTrafficLight.currentPhase(), Phase.ALL_STOP);
    }

}