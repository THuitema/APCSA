package com.thuitema.Labs.Unit2;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Savings Calculator Lab Part 1
  Purpose of Program:

 What I Learned:
 • Order of operations when concatenating strings
 • Declaring parameter types (i.e. double, int, etc.)
 • How to call methods inside of variables

 */

import java.util.Scanner;

public class CalculateSavingsPart2
{
    public static void main(String[] args)
    {
        double principle = getPrinciple();
        double time = getTime();
        double savingsReturn = calcSavingsAccount(principle, time);
        double marketReturn = calcMarketReturn(principle, time);
        calcDifference(savingsReturn, marketReturn);
    }

    public static double getPrinciple()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the amount of money saved: ");

        return console.nextInt();
    }

    public static double getTime()
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number of years the money will be invested: ");

        return console.nextInt();
    }

    public static double calcSavingsAccount(double principle, double time)
    {
        double savingsReturn = principle * Math.pow(1.0025, 4 * time);
        System.out.println("In a savings account with 1% annual interest for " + time + " years, you will save $" + (Math.round(savingsReturn * 100) / 100.0));

        return savingsReturn;
    }

    public static double calcMarketReturn(double principle, double time)
    {
        double marketReturn = principle * (Math.pow(Math.E, 0.07 * time));
        System.out.println("If you invest this money in the stock market for " + time + " years, you can expect to save $" + (Math.round(marketReturn * 100) / 100.0));

        return marketReturn;
    }

    public static void calcDifference(double savingsReturn, double marketReturn)
    {
        System.out.println("You can expect to save $" + (marketReturn - savingsReturn) + " more by investing in the stock market.");
    }
}


/*
Enter the amount of money saved: 100
Enter the number of years the money will be invested: 10
In a savings account with 1% annual interest for 10.0 years, you will save $110.5
If you invest this money in the stock market for 10.0 years, you can expect to save $201.38
You can expect to save $90.87196973414082 more by investing in the stock market.
 */