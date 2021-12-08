package com.mandiri;

import com.mandiri.entity.Car;
import com.mandiri.entity.Hero;
import com.mandiri.entity.Monster;
import com.mandiri.entity.Soldier;
import com.mandiri.geometry.Circle;
import com.mandiri.geometry.HyperRectangle;
import com.mandiri.geometry.Rectangle;
import com.mandiri.geometry.Shape;
import com.mandiri.interfaces.Bird;
import com.mandiri.interfaces.Dragon;
import com.mandiri.interfaces.Flyable;
import com.mandiri.interfaces.Plane;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.brand = "Daihatsu";
//        car.name = "Terios";
//        car.color = "Brown";
//
//        Car anotherCar = new Car();
//        anotherCar.brand = "Toyota";
//        anotherCar.name = "Camry";
//        anotherCar.color = "Black";

        //passing by reference
//        Car newCar = car;
//
//        System.out.println(car);
//        System.out.println(car.brand);
//        System.out.println(car.name);
//        System.out.println(car.color);
//
//        System.out.println(anotherCar);
//        System.out.println(anotherCar.brand);
//        System.out.println(anotherCar.name);
//        System.out.println(anotherCar.color);


        //passing by value
//        Integer a =  4;
//        Integer b = a;
//
//        b = b - 1;
//
//        System.out.println(a);
//        System.out.println(b);



        //ENCAPSULATION
//        1. Nama, Brand, Color tidak bisa diubah
//        2. Bisa menyalakan mesin mobil dengan syarat fuel>0
//
        Car aCar = new Car("Toyota", "Camry", "Black");
        System.out.println(aCar);

        aCar.startEngine();
        System.out.println(aCar);

        aCar.addFuel(5);
        aCar.startEngine();
        System.out.println(aCar);

        System.out.println("======================================");
//
        Hero saitama = new Hero("Saitama", 9999, 99);
        Hero gatotKaca = new Hero("Gatotkaca", 200, 28);
        Monster skeletonMan = new Monster("skeletonMan", 100, 12);
        Soldier serdadu = new Soldier(150, 50);

        //Saitama pukul gatotkaca

        System.out.println(saitama);
        System.out.println(gatotKaca);
        System.out.println(skeletonMan);
        System.out.println(serdadu);

//        gatotKaca.gettingPunch(saitama.damage);
//        skeletonMan.gettingPunch(saitama.damage);
//        serdadu.gettingPunch(saitama.damage);

        //object interaction
        saitama.punch(gatotKaca);
        saitama.punch(skeletonMan);
        saitama.punch(serdadu);

        System.out.println("AFTER PUNCH");
        System.out.println(saitama);
        System.out.println(gatotKaca);
        System.out.println(skeletonMan);
        System.out.println(serdadu);


        System.out.println("===================================");
        //INHERITANCE
        Rectangle soccerField = new Rectangle(100.0, 50.0);
        System.out.println(soccerField);
        System.out.println(soccerField.getArea());
        System.out.println(soccerField.getPerimeter());

        HyperRectangle aquarium = new HyperRectangle(7.0, 3.0, 3.0);
        System.out.println(aquarium);
        System.out.println(aquarium.getVolume());
        System.out.println(aquarium.getArea());


        System.out.println("======================================");
        //Polymorph
        Circle circle = new Circle(9.0);
        Rectangle rectangle = new Rectangle(7.0, 8.0);

        Shape [] shapes = {circle, rectangle};
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());

        Double sum = 0.0;
        for (Shape x:
             shapes) {
            sum = sum + x.getArea();
        }

        System.out.println(sum);
        System.out.println(circle.getArea()+rectangle.getArea());

        System.out.println("===============================");
        //Interface
        Bird bird = new Bird();
        Dragon dragon = new Dragon();
        Plane plane = new Plane();

        doFly(bird);
        doFly(dragon);
        doFly(plane);

    }

    static void doFly(Flyable flyable){
        flyable.fly();
    }


}
