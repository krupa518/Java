package com.training.inheritance;

public class Sample3  extends Sample2{
    public void div(){
        System.out.println("This is div method");
    }
    public static  void main(String [] args){
        Sample3 sample3 = new Sample3();
        sample3.add();
        sample3.mul();
        sample3.div();
        sample3.sub();
    }
}
