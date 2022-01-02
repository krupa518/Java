package com.training.ifstatement;

import java.util.Scanner;

public class Marks {
    public void marks(int marks) {

        if (marks < 34) {
            System.out.println("Sub is fail");
        } else if (marks >= 34 && marks < 60) {
            System.out.println("it is printing D garde");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("it is printing C garde");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("it is printing B garde");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("it is printing A garde");
        } else {
            System.out.println("Invalid!");
        }

    }
    }

