package com.cbfacademy.cars;

public class Car {

    public static void main(String[] args) {

    }
        private String make;
        private String model;
        private String colour;
        private int year;

        
  // Constructor
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

public void setColour(String colour) { //- sets the colour of the car
    this.colour = colour;
}

 // Method to get car details
 public String getDetails() {  //- returns the car details, including the make, model, colour and year

    return "Make: " + make + ", Model: " + model + ", Colour: " + colour + ", Year: " + year;
    }
}
