package com.training.constructor;

public class Vehicle {
    Vehicle(){
        System.out.println("this is bike");// //this is bike
    }
    public static void main(String... args){
        System.out.println("this is vehicle");//this is vehicle
        Vehicle vehicle = new Vehicle();

    }
}
