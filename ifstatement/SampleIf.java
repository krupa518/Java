package com.training.ifstatement;

import java.util.Scanner;
//Using if :
//====================
public class SampleIf {
    public static void main (String... args){
        System.out.println("enter number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("enter number is "+num);

        if(num == 10){
            System.out.println("sucess");

        }
        if(num ==10){
            System.out.println("SUCESS1");
        }
        else{
            System.out.println("unsucess");
        }
    }
}
