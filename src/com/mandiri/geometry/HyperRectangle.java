package com.mandiri.geometry;

public class HyperRectangle extends Rectangle{

    private Double height;

    // Harus punya constructor karena parent juga punya
    public HyperRectangle(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    public Double getVolume(){
        return this.length*this.width*this.height;
    }

    @Override
    public Double getArea() {
        return (2*this.length*this.width) + (2*this.width*this.height) + (2*this.length*this.height);
    }

    @Override
    public String toString() {
        return "HyperRectangle{" +
                "height=" + height +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
