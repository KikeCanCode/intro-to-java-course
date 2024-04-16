package com.cbfacademy;

import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
           // Implement this method such that
          //  it creates a list where for each element of the input list ${numbers}  
         // - if the ${element} is divisible by 3, it adds “Fizz” to the list
        // - if the ${element} is divisible by 5, it adds “Buzz” to the list  
       // - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        
       List<String> fizzBuzzList = new ArrayList<String>();
        for (Integer number : numbers) {
            if ((number % 3 == 0) && (number % 5 == 0)){ 
                fizzBuzzList.add("FizzBuzz"); 

        } else if (number % 3 == 0) {
                fizzBuzzList.add("Fizz");

        } else if (number % 5 == 0) {
                fizzBuzzList.add("Buzz");    
        } else {
       // - it adds the element to the list in any other case

                fizzBuzzList.add(number.toString());
        }
    }
        //  - it returns the constructed list

        return fizzBuzzList;
    }
    

    public String whichMonth(Integer number) {
        // - Implement this method such that
        
        //  - it returns the month corresponding to the input ${number}
        String month;
        switch (number){
            
            case 1:
                month = "January";
                 break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;    
            case 4:
                month = "April";
                 break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                 month = "July";
                 break;
            case 8:
                 month = "August";
            break;
                case 9:
                month = "September";
            break;
                case 10:
                month = "October";
            break;
                case 11:
                month = "November";
                 break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month number";
                break;
        }
    
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        return month;
    }
        
    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
    // - Implement this method such that
    //  - creates and initialises a list of 100 numbers - from 1 to 100
    Map<String, Integer> sums = new HashMap<>();
    List<Integer> hundred_numbers = IntStream.rangeClosed(1, 100).boxed().toList();
    Integer sumOfEvens = 0, sumOfOdds = 0;
    //  - determines the sum of all the even numbers in the list      
    //  - determines the sum of all the odd numbers in the list
    
        for (Integer number : hundred_numbers) {
            if(number % 2 == 0){ 
               sumOfEvens += number;
            }
            else{

                sumOfOdds += number;
            }
        }
      
        sums.put("SumOfEvens", sumOfEvens);
        sums.put("SumOfOdds" , sumOfOdds);

    //  - returns a map with two entries
    //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}     
    
        return sums;
    }


    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // - Implement this method such that
        //  - it takes an array list of integers
        ArrayList<Integer> reversed = new ArrayList<>(numbers);
        //  - it returns the list in reverse order
        Collections.reverse(reversed);

         return reversed;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}

  

/*String whichMonth [] month = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//int number [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    for (int number =1; numbers <= 12; i++ ){
    if (number <=12){
        System.out.print(whichMonth[number - 1]);
    }else
        System.out.print("Invalid month number");
    
    return month;
    
    }
        
  */

   