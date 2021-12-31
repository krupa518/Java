package com.training.interfaces;

public class Hdfc implements Bank,Sbi{
    public int income(){
        System.out.println("this is income");
             return 5;
    }
    public int debits(){
        System.out.println("this is debits ");
        return 5;
    }
    public static void main(String []args) {
        Hdfc hdfc = new Hdfc();
        hdfc.debits();
        System.out.print(hdfc.income());

    }
}
