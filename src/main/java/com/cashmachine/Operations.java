package com.cashmachine;

public class Operations  implements OperationsInterface{
    CashMachine cashMachine = new CashMachine();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: " + cashMachine.getBalance());

    }

    @Override
    public void depositAmount(double depositAmount) {

    }

    @Override
    public void withdrawalAmount(double withdrawalAmount) {

    }
}
