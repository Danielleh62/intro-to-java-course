package com.cbfacademy;

public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate) {

        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
} 
