package com.domaranskiy.builder;

public class TenagerCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Tenager Car");
    }

    @Override
    void buildColor() {
        car.setColor("black");
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(120);
    }

    @Override
    void buildCarTypes() {
        car.setCarTypes(CarTypes.HATCHBACK);
    }

    @Override
    void buildPrice() {
        car.setPrice(35000);
    }
}