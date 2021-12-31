package com.training.examples;

//Static to static
//=========================
public class SampleTest1 {
    public static void add(int x) {
        System.out.println("this is x:" + x);
    }

    public static void main(String[] args) {
        SampleTest1 sampleTest1 = new SampleTest1();
        add(10);         //1.static to static
        SampleTest1.add(10);  //2.static to static
        sampleTest1.add(10);   //3.static to static
    }
}
