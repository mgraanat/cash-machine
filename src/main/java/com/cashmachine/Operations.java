package com.cashmachine;

public class Operations  implements OperationsInterface{
    CashMachine cashMachine = new CashMachine();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + cashMachine.getBalance());

    }

    @Override
    public void depositAmount(double depositAmount) {
        cashMachine.setBalance(cashMachine.getBalance()+depositAmount);
        System.out.println(depositAmount +" Deposited Correct");

    }

    @Override
    public void withdrawalAmount(double withdrawalAmount) {
        if(withdrawalAmount <= cashMachine.getBalance()){
            System.out.println("Withdrawal Correct: " + withdrawalAmount);
        } else {
            System.out.println("Insufficient Balance");
        }

    }
}
