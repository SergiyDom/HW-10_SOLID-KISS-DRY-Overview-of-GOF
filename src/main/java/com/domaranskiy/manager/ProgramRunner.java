package com.domaranskiy.manager;

import com.domaranskiy.builder.*;
import com.domaranskiy.singleton.ProgramLogger;

public class ProgramRunner {
    public static void singletonRunner() {
        System.out.println("hash code at the beginning - " + ProgramLogger.getProgramLogger().toString() + "\n");
        ProgramLogger.getProgramLogger().addLogInfo("one ");
        ProgramLogger.getProgramLogger().addLogInfo("two ");
        ProgramLogger.getProgramLogger().addLogInfo("three ");

        ProgramLogger.getProgramLogger().showLogFile();
        System.out.println("hash code at the end - " + ProgramLogger.getProgramLogger().toString() + "\n");
    }

    public static void builderRunner(){
        Director director = new Director();
        director.setBuilder(new TenagerCarBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}