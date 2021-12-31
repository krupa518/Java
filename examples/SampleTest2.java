package com.training.examples;

//static to non static
//=======================
public class SampleTest2 {
    public void add(int x) {
        System.out.println("it is printing x value is:" + x);
    }

    public static void main(String[] args) {
        SampleTest2 sampleTest2 = new SampleTest2();
        sampleTest2.add(10);       //static to non-static

    }
}

