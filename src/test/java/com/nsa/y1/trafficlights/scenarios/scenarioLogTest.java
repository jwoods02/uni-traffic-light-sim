package com.nsa.y1.trafficlights.scenarios;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by James on 06/03/2017.
 */
public class scenarioLogTest {
    private scenarioLog logTest;

    @Before
    public void createLog() throws Exception {
        logTest = new scenarioLog();
    }

    @Test
    public void testLog() throws Exception {
        logTest.add("Test string.");
        assertEquals(logTest.get(), "1) Test string. ");

        logTest.add("Another test string.");
        assertEquals(logTest.get(), "1) Test string. 2) Another test string. ");
    }
}
