package com.nsa.y1.trafficlights.scenarios;

/**
 * Created by James on 05/03/2017.
 */
public class scenarioLog {

    private StringBuilder log;
    private String logEntry;
    private int entryCount;

    public scenarioLog() {
        log = new StringBuilder();
    }


    public void add(String logEntry) {
        entryCount++;
        String logEntryFinal = Integer.toString(entryCount) + ") " + logEntry + " ";
        log.append(logEntryFinal);
    }



    public String get() {
        return String.valueOf(log);
    }
}
