package com.thuitema.Labs.Unit4;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Burger Lab
  Purpose of Program: Calculate the user's net weekly and monthly take home pay based on how many hours they work

 What I Learned:
• Use the 'final' keyword to keep track of constants
• Variables declared outside for loops can be used inside them,
  but those declared inside the loop cannot be called outside of it
• You can call the loop control variable inside of the loop body
• You put a ';' between the conditions of a for loop, not ','

 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Pd8ThomasHuitemaBurger {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        final double WAGE = 5.15;
        final double TAX = 0.3;
        double monthlyPay = 0;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        for (int i = 1; i <= 4; i++){
            System.out.print("How many hours did you work in week " + i + "? ");
            int hours = console.nextInt();

            double weekPay = WAGE * hours - WAGE * hours * TAX; // Subtracts tax (30%) from earnings
            System.out.println("Your take-home pay is " + currency.format(weekPay));
            System.out.println();

            monthlyPay += weekPay; // Adding weekly pay to total month pay
        }

        System.out.println("Your total pay for the month is " + currency.format(monthlyPay));
        System.out.println("Hope you enjoy working at Babbage Burgers.");
    }
}

/*
How many hours did you work in week 1? 45
Your take-home pay is $162.23

How many hours did you work in week 2? 50
Your take-home pay is $180.25

How many hours did you work in week 3? 35
Your take-home pay is $126.18

How many hours did you work in week 4? 45
Your take-home pay is $162.23

Your total pay for the month is $630.88
Hope you enjoy working at Babbage Burgers.
*/
