package com.domaranskiy.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "Try to create singleton ... \n";

    private ProgramLogger() {
    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }

    @Override
    public String toString() {
        return "" + hashCode();
    }
}