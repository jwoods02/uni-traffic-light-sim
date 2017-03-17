package com.nsa.y1.trafficlights.scenarios;

import com.nsa.y1.trafficlights.lights.BasicTrafficLight;
import com.nsa.y1.trafficlights.lights.Phase;
import com.nsa.y1.trafficlights.lights.TrafficLight;

/**
 * Created by James on 04/03/2017.
 */
public class Roadworks implements Scenarios {
    private TrafficLight northTrafficLight;
    private TrafficLight southTrafficLight;
    private int timeBothLightsStop;
    private int timeBetweenLightChanges;
    private int timeForTrafficLightTransitions;
    private boolean interruptScenario;
    private scenarioLog log;

    public Roadworks (int timeBetweenLightChanges, int timeBothLightsStop, int timeForTrafficLightTransitions) {
        this.timeBetweenLightChanges = timeBetweenLightChanges;
        this.timeBothLightsStop = timeBothLightsStop;
        this.timeForTrafficLightTransitions = timeForTrafficLightTransitions;
        log = new scenarioLog();
    }

    public Roadworks(int timeBetweenLightChanges, int timeBothLightsStop) {
        this.timeBetweenLightChanges = timeBetweenLightChanges;
        this.timeBothLightsStop = timeBothLightsStop;
        timeForTrafficLightTransitions = 3000;
        log = new scenarioLog();
    }

    public void runTrafficLightCycle() {

        northTrafficLight = new BasicTrafficLight(timeForTrafficLightTransitions);
        southTrafficLight = new BasicTrafficLight(timeForTrafficLightTransitions);

        try {
            Thread.sleep(timeBothLightsStop);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        northTrafficLight.transitionMainLightsToGo();

        log.add("North light green.");

        try {
            Thread.sleep(timeBetweenLightChanges);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        northTrafficLight.transitionMainLightsToStop();

        log.add("North light red.");

        try {
            Thread.sleep(timeBothLightsStop);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        southTrafficLight.transitionMainLightsToGo();

        log.add("South light green.");

        try {
            Thread.sleep(timeBetweenLightChanges);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        southTrafficLight.transitionMainLightsToStop();

        log.add("South light red.");


    }

    public String getLog() {
        return log.get();
    }

    public Phase getNorthLightPhase() {
        return northTrafficLight.currentPhase();
    }

    public Phase getSouthLightPhase() {
        return southTrafficLight.currentPhase();
    }


}
