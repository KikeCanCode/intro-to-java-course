package com;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        
        // create an empty linked list

        LinkedList<Integer> integer = new LinkedList<>();

        //  - add 4 as the first element of the list
        integer.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integer.add(5);
        integer.add(6);
        integer.add(8);
        integer.add(2);
        integer.add(9);
       

        //  - add another 2 as the last element of the list
        integer.add(2);
        //  - add 4 as the 3rd element of the list
        integer.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen

        System.out.print(integer.element());
        //  - return the list
        return integer;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        
            Stack<Integer> integers = new Stack<>();
    
        //  - add 5, 6, 8, 9 to the stack
            integers.add(5);
            integers.add(6);
            integers.add(8);
            integers.add(9);
        
        //  - print the first element of the stack on the screen
        System.out.print(integers.firstElement());
        //  - print the last element of the stack on the screen
        System.out.print(integers.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(integers.pop());
        //  - invoke the push(4) method on the stack
        System.out.print(integers.push(4));
        //  - return the stack
        return integers;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        
        //  - add 5, 6, 8, 9 to the queue
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
        
        //  - print the first element of the queue on the screen
        System.out.print(arrayDeque.peekFirst());
        //  - print the last element of the queue on the screen
        System.out.print(arrayDeque.peekLast());
        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrayDeque.poll());
        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDeque.element());
        //  - return the queue
        return arrayDeque;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map

        HashMap<Integer, String> languages = new HashMap<>(); 
        //  - add {1, TypeScript} entry to the map
        languages.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        languages.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        languages.put(3, "Python");
        //  - add {4, Java} entry to the map
        languages.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        languages.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        languages.put(6, "Rust");

        //  - determine the set of keys from the map and print it on the screen
        System.out.print(languages.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(languages.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        
        System.out.print(languages.containsValue("English"));

        return languages; 
       
    }

    public String getName() {
        return "Collections Exercises";
    }
}
