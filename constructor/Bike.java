package com.training.constructor;

public class Bike {



    public  Bike(int x){

        this.integer =x;
        this.str =str;

   }
  public Bike(int x,String y){

      this.integer =x;
      this.str =y;
  }
    public Bike(String x ,int y){

        this.str =x;
        this.integer =y;


    }
    int integer;
    String str;


    public static void main(String... args){
        System.out.println("this is default constructor");
        Bike bike = new Bike(100);
        Bike bike1 = new Bike(10,"hi");
        Bike bike2 = new Bike("hello",20);
        /*System.out.println("this is string value is "+bike.str);
        System.out.println("this is default value is integer"+bike.integer);*/
        System.out.println(" this is printing bike values:"+bike.integer+" "+bike.str);
        System.out.println(" this is printing bike1 values:"+bike1.integer+" "+bike1.str);
        System.out.println(" this is printing bike2 values:"+bike2.str+" "+bike2.integer);

    }
}
