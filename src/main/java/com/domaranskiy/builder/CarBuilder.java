package com.domaranskiy.builder;

public abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    Car getCar() {
        return car;
    }

    abstract void buildName();

    abstract void buildColor();

    abstract void buildMaxSpeed();

    abstract void buildCarTypes();

    abstract void buildPrice();
}