package com.training.overloading;

public class Sample {

        public  static void add(String s){
            System.out.println("String name is:"+s);

        }
        public  void  add(int a)
    {
        System.out.println("integer number is:"+a);
        Sample.add("hellow");
    }
        public  static  void main( String [] args){
           Sample sample = new Sample();
           Sample.add("hi");
           sample.add(26);

    }

}
