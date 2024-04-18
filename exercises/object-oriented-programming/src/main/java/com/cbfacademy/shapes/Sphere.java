package com.cbfacademy.shapes;

public class Sphere extends Shape {
    private double radius;

public Sphere(double radius, String area) { // constructor
    super(area);
        this.radius = radius;
    }


    @Override
        double getArea(){
            return (4 * Math.PI * (Math.pow(radius, 2)));
        }
    }


