package com.mandiri.geometry;

public class Rectangle extends Shape{

    protected Double length;
    protected Double width;

    //constructor
    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double getArea(){

        return length*width;
    }

    @Override
    public Double getPerimeter(){
        return  (2*length)+(2*width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
