package com.thuitema.Labs.Unit2;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Savings Calculator Lab Part 1
  Purpose of Program:

 What I Learned:
 • How to use Math.E
 • How to perform operations inside an argument
 • Round doubles to two decimal places

 */

import java.util.Scanner;

public class CalculateSavingsPart1
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);

        // Gather user input
        System.out.print("Enter the amount of money saved: ");
        double principle = console.nextDouble();

        System.out.print("Enter the number of years the money will be invested: ");
        int time = console.nextInt();

        // Calculating returns
        double stockMarket = principle * (Math.pow(Math.E, 0.07 * time));
        double bankAccount = principle * Math.pow(1.0025, 4 * time);

        System.out.println("In a savings account with 1% annual interest for " + time + " years, you will save $" + (Math.round(bankAccount * 100) / 100.0));
        System.out.println("If you invest this money in the stock market for " + time + " years, you can expect to save $" + (Math.round(stockMarket * 100) / 100.0));
    }
}

/*
Sample Output:

Enter the amount of money saved: 100
Enter the number of years the money will be invested: 10
In a savings account with 1% annual interest for 10 years, you will save $110.5
If you invest this money in the stock market for 10 years, you can expect to save $201.38

 */