package com.training.interfaces;

public class Student implements College{
    public void books(){
        System.out.println("this is book");
    }
    public static void main(String []args) {
        College college = new Student();
        college.books();
        college.msg();
    }
}
