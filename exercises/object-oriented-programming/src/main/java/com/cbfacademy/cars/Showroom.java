package com.cbfacademy.cars;
import java.util.ArrayList;
import java.util.List;

/*  Create a class called Showroom with the following members:
public List<Car> getCars() - 
a blue Volvo V40 from 2012
a red Porsche Panamera from 2009
a grey Audi A3 from 2018
 */

public class Showroom {

    public List<Car> getCars(){ //means that there's a public method named getCars in the Showroom class that returns a list of Car objects. 
    List<Car> cars = new ArrayList<Car>();  //is creating a new instance of a list that can hold objects of type Car
    // list of cars
    Car car1 = new Car("Volvo", "V40", "blue", 2012); 
    Car car2 = new Car("Porsche", "Panamera", "red", 2009);
    Car car3 = new Car("Audi", "A3", "grey", 2018);
    
    
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);

    return cars;

    }
}

//(String make, String model, String colour, int year){
    // returns a list containing the following three Car objects:
    