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

public class Person {
    // peremennie klassa
    private String myName;
    private int myAge;
    private String myHairColor;
                    //argumenty
    public Person(String name, int age, String hair_color){
        this.myName = name;
        this.myAge = age;
        this.myHairColor = hair_color;
    }
    //public Person() {
        //overloading
    //}
    // getter
    public String getMyName(){
        return myName;
    }
    public int getMyAge(){
        return myAge;
    }
    public String getMyHairColor(){
        return myHairColor;
    }
    // setter
    public void setMyName(String name){
        myName = name;
    }
}
