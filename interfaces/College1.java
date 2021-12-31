package com.training.interfaces;

public interface College1{
   public void book();
     default void pen(){
        System.out.println("all are pens");

     }
}
