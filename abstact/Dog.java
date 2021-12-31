package com.training.abstact;

public class Dog extends Animal implements College{

    public void sound() {
        System.out.println("this is abstract");
    }
    public void teacher(){
        System.out.println("this is college");
    }
   public void eat(){
        System.out.println("this is dog:");
    }

    public static void main(String[] args) {
        System.out.println("this is Dog extends animal");
        Dog dog = new Dog();
        dog.eat();
        dog.teacher();
        dog.sound();


    }
}
