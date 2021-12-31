package com.training.inheritance;

public class Dog extends Animal{
    public static void sound(){
        System.out.println("sound is bow bow");
    }

    public  void barking(){
        sound();
        System.out.println("Dog sound is bow bow");
    }

   /* public static void main(String [] args){
        Animal animal = new Dog();
        animal.eat();
        animal.sound();
        System.out.println("it is print dog name ia:"+animal.name);
        System.out.println("it is print dog name ia:"+animal.id);

        Animal dog = new Dog();
       dog.sound();

    }*/
}
