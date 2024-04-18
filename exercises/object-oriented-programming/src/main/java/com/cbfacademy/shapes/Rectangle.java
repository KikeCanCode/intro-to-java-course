package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    
    private double length;
    private double width;
   
public Rectangle(double length, double width, String area) {
        super(area);
        this.length = length;
        this.width = width;
    }

@Override 
double getArea(){
    return (length * width);
}

}
