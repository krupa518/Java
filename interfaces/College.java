package com.training.interfaces;

public interface College {
    public void books();
    default void msg(){
        System.out.println("all are attend");
    }
}
