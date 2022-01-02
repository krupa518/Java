package com.training.ifstatement;

import java.util.Scanner;

public class Score {


    public static void main(String []args){
        System.out.println("enter value");
        Scanner scanner = new Scanner(System.in);
        int marksValue = scanner.nextInt();
Marks marks1 =new Marks();

marks1.marks(marksValue);
        //System.out.println("printing grade is:"+Marks);


    }

}
