package com.cashmachine;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int cardpin = 1234;
        Scanner in= new Scanner((System.in));
        System.out.println("Enter Pin");
        int pin = in.nextInt();
        if (cardpin==pin){
            System.out.println("Pin Correct");
        }
        else
            System.out.println("Pin Incorrect");
    }
}
