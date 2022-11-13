package com.cashmachine;

public class CashMachine {

    private double balance;
    private double depositAmount;
    private double withdrawalAmount;

    public CashMachine(double balance, double depositAmount, double withdrawalAmount) {
        this.balance = balance;
        this.depositAmount = depositAmount;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }
}
