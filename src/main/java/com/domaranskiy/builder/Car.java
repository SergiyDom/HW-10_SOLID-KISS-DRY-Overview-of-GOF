package com.domaranskiy.builder;

public class Car {
    private String name;
    private String color;
    private int maxSpeed;
    private CarTypes carTypes;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCarTypes(CarTypes carTypes) {
        this.carTypes = carTypes;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", carTypes=" + carTypes +
                ", price=" + price +
                '}';
    }
}