
/*In the same package, create a concrete class Cylinder that extends Shape:

Cylinder(double radius, double height) - constructor
double getArea() - overrides the base method. The value is given by the formula (height * 𝛑 * (radius2)).*/
package com.cbfacademy.shapes;

public class Cylinder extends Shape {
        double radius;
        double height;
    
    public Cylinder(double radius, double height){
       //super(area);
        this.name = "Cylinder"; //super name means it is define in the parent class Shape, so this shape can borrow -  inhenrite it from the parent.
        this.radius = radius;
        this.height = height;
        //super.name = "Cylinder";
        //super(name,"Cylinder");

    }
    @Override

    public double getArea(){
        this.area = (4 * Math.PI * (Math.pow(radius, 2)));
        return area;
    }
}