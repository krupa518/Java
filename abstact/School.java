package com.training.abstact;

public class School implements Bag {
    public void books(){
        System.out.println("this book is all in one");
    }
    public static void main( String []args){
        School school = new School();
        school.books();
    }
}
