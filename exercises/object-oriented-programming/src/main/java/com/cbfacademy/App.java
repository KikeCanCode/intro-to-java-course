package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    
    public static void main(String[] args) {
      System.out.println("Hello World!");

//In the main method of the App class, instantiate a Showroom object, call getCars() and print the details for each Car instance in the list.
//public static void main (String...args){}
       
        Showroom showroom = new Showroom(); // creating a a showroom object
       
        List<Car> cars = showroom.getCars(); //is invoking the getCars() method of the showroom object and assigning the returned list of cars to the variable cars
      
       // Printing details for each car instance in the list
        for (Car car : cars) {

            System.out.println(showroom.getCars());
        }
    }
}

