package com.vishnu.math;

public class BankAccount {
    int balance ;
    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.err.println("Insuuficent balance");
        }
    }

    public int getBalance() {
        return balance;
    }
}
