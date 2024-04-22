/* In the same package, create a concrete class Rectangle that extends Shape:
Rectangle(double length, double width) - constructor
double getArea() - overrides the base method. The value is given by the formula (length * width)*/

package com.cbfacademy.shapes;

public class Rectangle extends Shape { //create a concrete class Rectangle that extends Shape
    
       private double length;
        private double width;
   
    public Rectangle(double length, double width) { //constructor 
        super.name = "Rectangle"; // super name means it is define in the parent class Shape, so this shape rectangle can borrow it - inhenrite it from the parent.
        //super(area);
        this.length = length;
        this.width = width;
        //area = length * width;
        //area = length * width;
    }

    @Override 
    public double getArea(){
        this.area = (length * width);
        return area; 
    }


}
