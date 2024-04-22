/* In the same package, create a concrete class Sphere that extends Shape:

Sphere(double radius) - constructor
double getArea() - overrides the base method. The value is given by the formula (4 * 𝛑 * (radius2))*/

package com.cbfacademy.shapes;

    public class Sphere extends Shape {
        private double radius;

    public Sphere(double radius) { // constructor
        super.name = "Sphere"; // super name means it is define in the parent class Shape, so this shape Sphee can borrow name - it inhenrite it from the parent.
        //super(area);
        this.radius = radius;
    }

    @Override
    public double getArea(){
        this.area = (4 * Math.PI * (Math.pow(radius, 2)));
        return area;
    }
  
}
  /*     @Override 
    public String getName(){
        return Name;
    }*/ //- this will return the name of the shape

