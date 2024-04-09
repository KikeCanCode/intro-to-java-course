package com.cbfacademy;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        // - if the ${element} is divisible by 3, it adds “Fizz” to the list
        // - if the ${element} is divisible by 5, it adds “Buzz” to the list  
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
       //  - it adds the element to the list in any other case
        List<String> fizzBuzz = new ArrayList<>();
       
        for (int i= 0; i < numbers.size(); i++) {
        if (i % 3 == 0) {
            System.out.print(i + "Fizz");
        
        } else if (i % 5 == 0) {
            System.out.print(i + "Buzz");
        
        }else if (i % 3 == 0 && i % 5 == 0){ 
        System.out.print(i + "FizzBuzz"); 

        } else {
        System.out.print(numbers.get(i));
        }
    }
        //  - it returns the constructed list

        return fizzBuzz;
    }
    

    //public String whichMonth(Integer number) {
    // TODO - Implement this method such that
    public void whichMonth(Integer number) {
     //  - it returns the month corresponding to the input ${number}
     //  - if the ${number} is invalid, the method should return "Invalid month number"
        String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //int [] i  = {1,2,3,4,5,6,7,8,9,10,11,12};
        // try with map

        for (int i = 0; i <= 12; i++) {
            if (i <=12){

                System.out.print(months); 
            } else {
                System.out.print("Invalid month number");

            }
    
        }       
        

    }
    

   public Map<String, Integer> sumOfOddsAndSumOfEvens() {
    // TODO - Implement this method such that

    //  - creates and initialises a list of 100 numbers - from 1 to 100
        Integer [] number = {100};
    //  - determines the sum of all the even numbers in the list
        Integer sumOfOdds = 0; 

        Integer sumOfEvens = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { 
            System.out.print(i+=i);
    //  - determines the sum of all the odd numbers in the list   

        } else if (i % 3 == 0) {

        System.out.print(i+=i);
    //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        }
    
        return 

        //)"sumOfEvens".calculatedSumOfEvens, "sumOfOdds".calculatedSumOfOdds;
    }

    
    public List<Integer> reverse(ArrayList<Integer> numbers) {
        
        // TODO - Implement this method such that
        ArrayList<Integer> ArrayList = new ArrayList<>(numbers);

        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
/*  public List<Integer> reverse(ArrayList<Integer> numbers) {
        // Create a new ArrayList to store the reversed numbers
        ArrayList<Integer> reversed = new ArrayList<>(numbers);

        // Reverse the list using Collections.reverse() method
        Collections.reverse(reversed);

        // Return the reversed list
        return reversed;
    }
}*/