package com.company;

import java.util.Scanner;

public class Main {
    // Write a program that create an object of a person. User can state how many people to create
    // Use the object to create multiple persons with the following attributes based on the user's input
    // - Name
    // - Age
    // - Hair color
    // add a method in a separate class called Average and put in a method
    // to collate the average of people based on the number of the people entered.

    // Main, Average, Person


    public static void main(String[] args) {

        // Initialize scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of persons: ");
        int num = scanner.nextInt();
        Person[] people = new Person[num];
        int[] ages = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Please enter the person name: ");
            String name = scanner.next();
            System.out.println("Please enter the person age: ");
            int age = scanner.nextInt();
            System.out.println("Please enter the person hair color: ");
            String hair_color = scanner.next();

            people[i] = new Person( name, age, hair_color);

            ages[i] = age; // ARRAY OF AGES

        }
        System.out.println(Average.avg_ages(ages));

        // System.out.println(person.getMyName());
        // System.out.println(person.getMyAge());
        // System.out.println(person.getMyHairColor());


    }
}
