package com.training.examples;
//non static to non static
//=============================
public class SampleTest4 {
    public void add(int x){
        System.out.println("it is a printing "+x);
        mul(11);
    }
    public void mul(int x){
        System.out.println("it is printing"+x);


    }
    public static void main(String [] args){
        SampleTest4 sampleTest4 = new SampleTest4();
        sampleTest4.add(11);


    }
}
