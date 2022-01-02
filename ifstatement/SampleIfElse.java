package com.training.ifstatement;

import java.util.Scanner;

public class SampleIfElse {
    public static void main(String... args){
        System.out.println("this is string name");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.println("enter the name is:"+str);
        if(str.equalsIgnoreCase("trust")){
            System.out.println("sucess");
        }
        else if(str.equalsIgnoreCase("trust1")){
            System.out.println("sucess1");
        }
        else{
            System.out.println("un sucess");
        }
    }
}
