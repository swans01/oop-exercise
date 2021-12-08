package com.mandiri.entity;

public class Car {

    private String brand;
    private String name;
    private String color;
    private String engineStatus = "OFF";
    private Integer fuel = 0;

    //constructor
    public Car(String brand, String name, String color) {
        this.brand = brand;
        this.name = name;
        this.color = color;
    }

    public void startEngine(){
        if(fuel > 0){
            engineStatus = "ON";
        }
    }

    public void addFuel(Integer addition){
        this.fuel = this.fuel + addition;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engineStatus='" + engineStatus + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
