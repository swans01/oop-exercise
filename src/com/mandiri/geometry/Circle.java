package com.mandiri.geometry;

public class Circle extends Shape {

    public Double pi = 3.14;
    public Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double getArea() {
        return pi*radius*radius;
    }

    @Override
    public Double getPerimeter() {
        return pi*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                ", radius=" + radius +
                ", area=" + getArea() +
                ", perimeter" + getPerimeter() +
                '}';
    }
}
