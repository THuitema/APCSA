package com.thuitema.Unit_1;

public class September16 {

    public static void main(String[] args) {
        // Variables

        int x; // Declaration
        x = 10; // Initialization
        x = x + 2;
        System.out.println(x);

        double gpa  = 4.37;
        gpa = 4.45;
        System.out.println(gpa);
        System.out.println();
        /* Modulus
        5 % 2 = 1
        17 % 3 = 3
        3 % 4 = 3
         */

        // Print a 3 digit number, 1 digit per line
        int n = 125; // Works for any 3 digit number
        System.out.println(n / 100 % 10);
        System.out.println(n / 10 % 10);
        System.out.println(n % 10);

        System.out.println();

        // Average number
        double num1 = 23;
        double num2 = 41;
        double num3 = 19;
        double average;

        average = (num1 + num2 + num3) / 3;
        System.out.println(average);
        System.out.println();

        // Print a 4 digit number, 1 digit per line
        int number = 1776;
        System.out.println(number / 1000 % 10);
        System.out.println(number / 100 % 10);
        System.out.println(number / 10 % 10);
        System.out.println(number % 10);

        
    }
}
