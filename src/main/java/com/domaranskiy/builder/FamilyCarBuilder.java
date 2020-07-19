package com.domaranskiy.builder;

public class FamilyCarBuilder extends CarBuilder {
    @Override
    void buildName() {
        car.setName("Family Car");
    }

    @Override
    void buildColor() {
        car.setColor("green");
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(160);
    }

    @Override
    void buildCarTypes() {
        car.setCarTypes(CarTypes.SEDAN);
    }

    @Override
    void buildPrice() {
        car.setPrice(45000);
    }
}