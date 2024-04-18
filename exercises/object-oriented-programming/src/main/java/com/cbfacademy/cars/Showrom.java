package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;
/*  Create a class called Showroom with the following members:
public List<Car> getCars() - 
a blue Volvo V40 from 2012
a red Porsche Panamera from 2009
a grey Audi A3 from 2018
 */
public class Showrom {

    public List<Car> getCars(){
    // returns a list containing the following three Car objects:
    List<Car> cars = new ArrayList<Car>();    
    
    Car car1 = new Car("Volvo", "V40", "Blue", 2009); 
    Car car2 = new Car("Porsche", "Panamera", "Red", 2009);
    Car car3 = new Car("Audi", "A3", "Grey", 2009);
   
    cars.add(car1);
    cars.add(car2);
    cars.add(car3);

    return cars;

    }
}

