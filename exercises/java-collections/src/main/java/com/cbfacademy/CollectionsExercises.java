package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        
        // TODO: create an empty linked list

        LinkedList<Integer> integer = new LinkedList<>();

        //  - add 4 as the first element of the list
        integer.add(4);
        //  - then add 5, 6, 8, 2, 9 to the list
        integer.add(5);
        integer.add(6);
        
        integer.add(8);
        integer.add(2);
        integer.add(9);
        integer.add(2);

        //  - add another 2 as the last element of the list
        
        //  - add 4 as the 3rd element of the list
        integer.add(2, 4);
        //  - invoke the method element() on the list and print the result on the screen

        System.out.print(integer.element());
        //  - return the list
        return integer;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        
            Stack<Integer> integer = new Stack<>();
    
        //  - add 5, 6, 8, 9 to the stack
            integer.add(5);
            integer.add(6);
            integer.add(8);
            integer.add(2);
            integer.add(9);
        
        //  - print the first element of the stack on the screen
        System.out.print(integer.firstElement());
        
        //  - print the last element of the stack on the screen
        System.out.print(integer.lastElement());
        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(integer.pop());
        //  - invoke the push(4) method on the stack
        System.out.print(integer.push(4));
        //  - return the stack
        return integer;
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
        public HashMap<Integer, String> hashMap = new HashMap<>(); // use capaital H and got errors so changed to h and the rest of the list
        //  - add {1, TypeScript} entry to the map
        hashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        hashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        hashMap.put(3, "Phyton");
        //  - add {4, Java} entry to the map
        hashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        hashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        hashMap.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(hashMap.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(hashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(hashMap.containsValue("English"));
        //  - return the map
       return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
