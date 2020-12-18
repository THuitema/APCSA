package com.thuitema.Labs.Unit5;
/*
 * Name: Thomas Huitema
 * Period: 8
 * Lab Name: Account Lab
 * Purpose of Program: Practice writing a class that includes accessor and modifier methods
 *
 * What I learned:
 * • In the equals method, I compared objects using "==" instead
 *   of the .equals method because "balance" is type double, primitive
 * • You can have user-defined objects as method parameters
 * • Using "this" can help distinguish between reference variables
 *   and parameters
 */

public class Pd8ThomasHuitemaAccount {
    public static void main(String[] args) {
        Account savings = new Account(100);
        Account checking = new Account(50);

        savings.withdraw(25);
        checking.deposit(25);

        System.out.println(savings);
        System.out.println(checking);
        System.out.println(savings.equals(checking));
    }
}

class Account {
    private double balance;

    // Default constructor
    public Account() {
        balance = 0;
    }

    // Non-default constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Modifier method
    public void deposit(double amount) {
        // The user could put a negative number, makes sure balance is above 0
        if (balance + amount >= 0) {
            balance += amount;
        }

    }

    // Modifier method
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
        }
        // Balance stays same if the amount withdrawn makes the balance negative
    }

    // Accessor method
    public double checkBalance() {
        return balance;
    }

    public String toString() {
        return "Balance: $" + balance;
    }

    public boolean equals(Account other) {
        return this.balance == other.balance; // Have to use "==" because double is a primitive type
    }
}

/*
Balance: $75.0
Balance: $75.0
true
 */