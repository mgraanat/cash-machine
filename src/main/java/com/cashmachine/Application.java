package com.cashmachine;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int cardpin = 1234;
        Scanner in= new Scanner((System.in));
        OperationsInterface operationsInterface = new Operations();
        System.out.println("Welcome to Cash Machine");
        System.out.println("Enter Pin");
        int pin = in.nextInt();
        if (cardpin==pin){
            System.out.println("Pin Correct");
            while (true) {
                System.out.println("1.View Balance\n2.Deposit Amount\n3.Withdrawal Amount\n4.Exit");
                System.out.println("Choose an option: ");
                int choose = in.nextInt();
                if (choose == 1) {
                    operationsInterface.viewBalance();
                }
                else if (choose == 2){

                }
                else if (choose==3){

                }
                else if (choose==4){
                    System.out.println("Collect Your Card");
                    System.exit(0);
                }
            }

        }
        else
            System.out.println("Pin Incorrect");
    }
}
