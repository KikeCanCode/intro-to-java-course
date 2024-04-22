
/* Part 1
Inside the shapes package, create an abstract class Shape with the following members:
abstract double getArea() - returns the area of the shape
String getName() - returns the name of the shape

In the same package, create a concrete class Sphere that extends Shape:

Sphere(double radius) - constructor
double getArea() - overrides the base method. The value is given by the formula (4 * 𝛑 * (radius2))
In the same package, create a concrete class Rectangle that extends Shape:

Rectangle(double length, double width) - constructor
double getArea() - overrides the base method. The value is given by the formula (length * width)
In the same package, create a concrete class Cylinder that extends Shape:

Cylinder(double radius, double height) - constructor
double getArea() - overrides the base method. The value is given by the formula (height * 𝛑 * (radius2)).*/

package com.cbfacademy.shapes;

//create an abstract class Shape with the following members:

    public abstract class Shape { // Added "abstract" to class field because it says create and abstract 

        double area;
        String name;
   
   abstract double getArea(); //- returns the area of the shape
    //return area;
    // I  deleted the return area because, it says "abstract" - which means, it will not define the implementation of getArea in the shape class but in each shape. 
    public String getName() {
        return name;  //- returns the name of the shape
    }
}