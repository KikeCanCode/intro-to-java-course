package com.cbfacademy.sort;
    //https://www.programiz.com/dsa/binary-search
    //Given what we've learned about this algorithm, create a program that implements it in Java.
    //do until the pointers low and high meet each other. - meaning set a pointer at low and high and search until they meet in the midle

    public class BinarySearch {
// This is the method() -  called binarySearch of integer array list of x,low,and high.
    
Integer binarySearch(Integer array[], Integer x, Integer low, Integer high) {  

     // the agrument -   
    if(low <= high){ 
        // find the mid element 
        int mid = (low + high)/2; 
      // if x == to mid 
     if (x == array[mid]);
         return mid;
        // if x is greater than mid elelemt search the right side of the list
    if (x > array[mid]) { // x is on the right side
        low = mid + 1;
            } 
            // if x less than the mid element search to the left
     else                  // x is on the left side
          high = mid - 1;

    
        return -1;
    
        }  

    }
  

