package com.training.overloading;

public class Test {
    public void add(int x){
        System.out.println("add value:"+x);
    }
    public void add(String x){
        System.out.println("add value:"+x);
    }
    public void add(double x){
        System.out.println("add value:"+x);
    }
    public void add(int x,int y){
        System.out.println("add value:"+(x+y));
    }
    public void add(String x,String y){
        System.out.println("add value:"+(x+y));
    }
    public void add(double x,double y){
        System.out.println("add value:"+(x+y));
    }

    public static void main(String[] args){
        Test test =new Test();
        test.add(1);
        test.add("hi");
        test.add(10.0);
        test.add(1,2);
        test.add("hi","krupa");
        test.add(10.0,20.0);

    }
}
