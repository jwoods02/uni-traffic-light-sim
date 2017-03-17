package com.nsa.y1.trafficlights.lights;

/**
 * Created by James on 03/03/2017.
 *
 * Information on transition times from
 * https://www.quora.com/When-a-traffic-light-changes-to-red-does-the-other-traffic-light-immediately-change-to-green-or-does-it-wait-for-a-few-seconds-before-changing-to-green
 *
 */
public class BasicTrafficLight extends TrafficLight {

    private final int timeToSleep;

    public BasicTrafficLight(int timeToSleep) {
        setRedLightOn(true);
        this.timeToSleep = timeToSleep;
    }

    public BasicTrafficLight() {
        setRedLightOn(true);
        timeToSleep = 3000;
    }

    public void transitionMainLightsToStop() {
        if ( currentPhase().equals(Phase.ALL_GO) || currentPhase().equals(Phase.UNKNOWN) ) {
            setGreenLightOn(false);
            setAmberLightOn(true);

            try {
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setAmberLightOn(false);
            setRedLightOn(true);


        }

    }

    public void transitionMainLightsToGo() {

        if ( currentPhase().equals(Phase.ALL_STOP) || currentPhase().equals(Phase.UNKNOWN)) {
            setAmberLightOn(true);
            try {
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setRedLightOn(false);
            setAmberLightOn(false);
            setGreenLightOn(true);
        }


    }


}
