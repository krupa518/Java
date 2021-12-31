package com.training.abstact;

public  abstract class Sbi implements Bank{
   public abstract void credit();
    public  void debit(){
        System.out.println("this is debit ");
    }
}
