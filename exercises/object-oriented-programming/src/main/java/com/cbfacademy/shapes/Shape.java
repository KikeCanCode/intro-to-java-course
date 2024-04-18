package com.cbfacademy.shapes;

public abstract class Shape {

    double Area;
    String Name;

public Shape(double area) {
        this.Area = area;      
    }
double getArea() {
    return Area;
} //- returns the area of the shape

public Shape(String name) {
    this.Name = name;
}

String getName() {
    return Name;//- returns the name of the shape
}
}