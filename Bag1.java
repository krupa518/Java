package com.training.abstact;

public class Bag1 extends School1{
    public void pens(){
        System.out.println("pens are: "+(a+a));
    }
    public static void main(String [] args){
        Bag1 bag1 = new Bag1();
        bag1.a =100;
        bag1.pens();
    }
}
