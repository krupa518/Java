package com.training.interfaces;

public class Teacher implements College1,College2 {
    public void book() {

        System.out.println("this is book:");
    }


    public void pen() {
        College1.super.pen();
    }


    public static void main( String [] args){

        Teacher teacher = new Teacher();
        teacher.book();
        teacher.pen();
    }



}
