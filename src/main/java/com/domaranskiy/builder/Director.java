package com.domaranskiy.builder;

public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.buildName();
        builder.buildColor();
        builder.buildMaxSpeed();
        builder.buildCarTypes();
        builder.buildPrice();

        Car car = builder.getCar();
        return car;
    }
}