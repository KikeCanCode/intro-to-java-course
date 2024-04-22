/*Part 1
Inside the cars package, create a class called Car with the following members:

private String make
private String model
private String colour
private int year
public Car(String make, String model, String colour, int year) - constructor that accepts parameters representing the make, model, colour and year of the car
public String getMake() - returns the car make
public String getModel() - returns the car model
public int getYear() - returns the year the car was made
public String getColour() - returns the colour of the car
public String setColour() - sets the colour of the car
public String getDetails() - returns the car details, including the make, model, colour and year */

package com.cbfacademy.cars; // Package


public class Car { // Class

    //the class Field - Defines what data can be stored.

        private String make; // these are instance field - data 
        private String model;
        private String colour;
        private int year;
     
  // Constructor - Line 14 to 20 
    public Car(String make, String model, String colour, int year) {

        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }


        // Getter methods

    public String getMake() {  //- returns the car make
        return make;
    }
    
    public String getModel(){
        return model;
    } //- returns the car model

    public int getYear() { //- returns the year the car was made
        return year;
    } 

    public String getColour() { //- returns the colour of the car
        return colour;
    }
    // Setter method

    public void setColour(String colour) { //- sets the colour of the car it shouldn't be string as stated in the readme
        this.colour = colour;
    }

    // Method to get car details
    public String getDetails() {  //- returns the car details, including the make, model, colour and year
    //String details = String.format(make, model, colour, year);
    //return details;} - THIS DIDNT WORK SO FOLLOWED THE EXAMPLE ON PAGE 24 - CONSTRUCTOR
    
        return "Make: " + make + ", Model: " + model + ", Colour: " + colour + ", Year: " + year;

    }
}


    