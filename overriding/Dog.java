package com.training.overriding;

public class Dog extends Animal{
     /*public String sound(){
         return "bow bow";
     }*/
    /* protected String sound(){
         return "bow bow";
     }*/
     String sound(){
         return "bow bow";
     }


    public static void main(String []args){

   /* Dog dog =new Dog();
    Animal animal = new Animal();
    System.out.println("this is dog sound is:"+dog.sound());
    System.out.println("this is cat sound is:"+animal.sound());*/
       Animal animal = new Dog();
       System.out.println("animal sound is:"+ animal.sound());

}
}
