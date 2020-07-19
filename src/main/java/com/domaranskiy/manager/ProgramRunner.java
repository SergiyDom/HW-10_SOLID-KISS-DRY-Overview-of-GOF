package com.domaranskiy.manager;

import com.domaranskiy.singleton.ProgramLogger;

public class ProgramRunner {
    public static void singletonRunner() {
        System.out.println("hash code at the beginning - " + ProgramLogger.getProgramLogger().toString() + "\n");
        ProgramLogger.getProgramLogger().addLogInfo("one ");
        ProgramLogger.getProgramLogger().addLogInfo("two ");
        ProgramLogger.getProgramLogger().addLogInfo("three ");

        ProgramLogger.getProgramLogger().showLogFile();
        System.out.println("hash code at the end - " + ProgramLogger.getProgramLogger().toString());
    }
}