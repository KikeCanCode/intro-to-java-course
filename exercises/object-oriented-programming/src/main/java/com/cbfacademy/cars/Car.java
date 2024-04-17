package com.cbfacademy.cars; // Package

public class Car { // Class

public static void main(String[] args) { // Line 5 to 11 is the Field - Defines what data can be stored.

    }
private String make;
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
    String details = String.format(make, model, colour, year);

    return details;


    }
}


    