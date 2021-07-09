package com.company;
// Write a program that create an object of a person. User can state how many people to create
//
// Use the object to create multiple persons with the following attributes based on the user's input
// - Name
// - Age
// - Hair color
// add a method in a separate class called Average and put in a method
// to collate the average of people based on the number of the people entered.

// Main, Average, Person

public class Average {

    public static float avg_ages(int[] values) {
        float sum = 0;

        for (int i = 0; i < values.length; i++) {

            sum += values[i];
        }
        sum /= values.length;
        return sum;

    }


}
