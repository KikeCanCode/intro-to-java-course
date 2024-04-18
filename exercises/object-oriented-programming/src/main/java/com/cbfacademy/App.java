package com.cbfacademy;

import com.cbfacademy.cars.Showrom;

public class App {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

//In the main method of the App class, instantiate a Showroom object, call getCars() and print the details for each Car instance in the list.
        Showrom showrom = new Showrom();
        System.out.println(showrom.getCars());
    }
}
