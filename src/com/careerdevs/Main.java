package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Practice prac = new Practice();
        int year = 2400;
        String bool = prac.isLeapYear(year) ? "Yes" : "No";
        int fibNum = 6;
        System.out.printf("\nIs the year %d a leap year? %s\n", year, bool);
        System.out.printf("The fibonacci of %d is %d\n", fibNum, prac.fib(fibNum));


        int[] arr = new int[8];
        arr[3] = 3;

        List<Integer> list = new ArrayList<>();
        List<Dog> myDogs = new ArrayList<>();


        myDogs.add(new Dog("Short", "Spot"));
        myDogs.add(new Dog("Long", "Fifo"));
        myDogs.add(new Dog("Medium", "Lifo"));
        myDogs.add(new Poodle("Black", "Doodle"));

        list.add(4);
        list.add(42);
        list.add(5);

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        for (Dog dog : myDogs) {
            System.out.println(dog.details());
            if(dog instanceof Poodle)
                System.out.println(((Poodle) dog).dance());
        }

    }
}
