package com.cbfacademy.shapes;

/* Part 2
Inside the shapes package, create a class Paint with the following members:
Paint(double coverage) - constructor that accepts a parameter representing the number of square feet per gallon this paint can cover
getAmount(Shape shape) - returns the amount of paint (measured in gallons) needed to paint a given shape*/

public class Paint {

    protected double coverage; // I used protected Access Modifier because this declarations are visible within the package.
    protected double gallonsNeeded;

    public Paint(double coverage){ // This is the constructor
        //super(area);
        this.coverage = coverage;
    }

    // Method to calculate the amount of paint needed for a given shape
    public double getAmount(Shape shape) {
        double area = shape.getArea();
        double gallonsNeeded = area / coverage; // this means the area divided by gallon to get he number of gallons needed.
        // Calculate gallons needed based on coverage
        return area / coverage; 
    }
}




