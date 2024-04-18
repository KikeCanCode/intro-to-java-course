package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    double radius;
    double height;
    
public Cylinder(double radius, double height, double area){
    super(area);

this.height = height;

}
@Override

double getArea(){
    return (height * 4 * Math.PI * (Math.pow(radius, 2)));
    }
}