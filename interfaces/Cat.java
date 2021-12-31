package com.training.interfaces;

public class Cat implements Dog{
    public void eat(){
        System.out.println("all animals are eat");
    }
    public static  void main(String [] args){
        Cat cat = new Cat();
        cat.eat();
    }
}
