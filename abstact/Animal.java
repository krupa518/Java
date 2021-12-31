package com.training.abstact;

public abstract class Animal { //5) The abstract keyword is used to declare abstract class.
    public abstract void sound();//1) Abstract class can have abstract and non-abstract methods.
    public void eat(){
        System.out.println("this is dog");
    }
}
