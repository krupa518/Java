package com.training.abstact;

public class Hdfc  extends Sbi implements Bank{
    public void credit(){
        System.out.println("this is credit");
    }
    public  void deposit(){
        System.out.println("this is deposit");
    }



}
