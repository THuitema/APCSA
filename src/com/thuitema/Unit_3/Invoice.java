package com.thuitema.Unit_3;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        // Given Code
        Scanner keyboard = new Scanner (System.in);

        System.out.println ("Enter the item: ");
        String item = keyboard.nextLine();

        System.out.println ("Enter the price");
        double price = keyboard.nextDouble();

        System.out.println ("Overnight delivery (0 == no, 1 == yes)");
        int shippingMethod = keyboard.nextInt();

        printInvoice(item, price, shippingMethod);
    }

    public static void printInvoice (String item, double price, int shippingMethod)
    {   // your code goes here
        double shipping;

        if (price < 10) {
            shipping = 2.00;
        }
        else {
            shipping = 3.00;
        }
        if (shippingMethod == 1) {
            shipping += 5.00;
        }

        System.out.println("Invoice:");
        System.out.println(item + " " + price);
        System.out.println("shipping " + shipping);
        System.out.println("total " + (price + shipping));
    }

}
