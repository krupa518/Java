package com.training.examples;

//this is non-static to static
//================================
public class SampleTest3 {

    public static void main(String[] args) {
        SampleTest3 sampleTest3 = new SampleTest3();
        sampleTest3.add(10);

    }

    /*public void add(int x) {
        System.out.println("this is value x is:" + x);
        mul(11);
        dev(12);
    }
    public  static void mul(int x) {
        System.out.println("this is value x is:" + x);
    }
    public   void dev(int x) {
        System.out.println("this is value x is:" + x);
    }
*/
    public  static void add(int x) {
        System.out.println("this is value x is:" + x);
        //mul(11);
        SampleTest3.mul(11);
       SampleTest3.dev(12);
    }
    public  static void mul(int x) {
        System.out.println("this is value x is:" + x);
    }
 public static void dev(int x) {
        System.out.println("this is value x is:" + x);
    }


}
