package com.nsa.y1.trafficlights.scenarios;

import com.nsa.y1.trafficlights.lights.Phase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by James on 05/03/2017.
 */
public class RoadworksTest {

    private Roadworks roadworksScenario;
    private Roadworks roadworksQuick;

    @Before
    public void createRoadworks() throws Exception {
        // Lights on for 5 seconds, both stopped for 1 second
        roadworksScenario = new Roadworks(50000, 1000 );
        roadworksQuick = new Roadworks(0, 0, 0);
    }

    @Test(timeout = 100000)
    public void testRoadworkPhases() throws Exception {
        roadworksQuick.runTrafficLightCycle();
        assertEquals(roadworksQuick.getNorthLightPhase(), Phase.ALL_STOP);
        assertEquals(roadworksQuick.getSouthLightPhase(), Phase.ALL_STOP);

        assertEquals(roadworksQuick.getLog(), "1) North light green. 2) North light red. 3) South light green. 4) South light red. ");
    }

}
