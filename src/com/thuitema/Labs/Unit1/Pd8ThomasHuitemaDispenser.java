package com.thuitema.Labs.Unit1;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Dispenser Lab
  Purpose of Program: Determine the change dispensed from a vending machine

  What I Learned:
 • How to use modulus in conjunction with division
 • Performing math operations on variables
 • String concatenation

 */

import java.util.Scanner;

public class Pd8ThomasHuitemaDispenser
{

    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);

        // Getting input for price of item
        System.out.print("Enter price of item (in cents): ");
        int price = console.nextInt();

        // Determining change
        int change = 100 - price;

        int numQuarters = change / 25;
        int numDimes = change % 25 / 10;
        int numNickles = change % 25 % 10 / 5;
        int numPennies = change % 5;

        // Output
        System.out.println("You bought an item for " + price + " cent(s) and gave me a dollar, so your change is: \n");
        System.out.println(numQuarters + " quarter(s), " + numDimes + " dime(s), " + numNickles + " nickle(s), " + numPennies + " penny(ies) ");

    }
}

/*
Program Output:

Enter price of item (in cents): 19
You bought an item for 19 cent(s) and gave me a dollar, so your change is:

3 quarter(s), 0 dime(s), 1 nickle(s), 1 penny(ies)

*/
