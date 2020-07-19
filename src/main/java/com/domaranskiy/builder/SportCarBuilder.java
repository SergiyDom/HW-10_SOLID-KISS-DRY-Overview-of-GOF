package com.domaranskiy.builder;

public class SportCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Sport Car");
    }

    @Override
    void buildColor() {
        car.setColor("red");
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(300);
    }

    @Override
    void buildCarTypes() {
        car.setCarTypes(CarTypes.COUPE);
    }

    @Override
    void buildPrice() {
        car.setPrice(65000);
    }
}