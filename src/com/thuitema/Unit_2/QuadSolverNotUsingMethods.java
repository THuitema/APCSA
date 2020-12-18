package com.thuitema.Unit_2;

/*
Name: Thomas Huitema
Period: 8
Date: 10/2
Project: Worksheet 0B QuadSolverNotUsingMethods

*/

import java.util.Scanner;

public class QuadSolverNotUsingMethods {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);

        // Get coefficients from user
        System.out.print("Enter the 'a' coefficient of the quadratic: ");
        int a = console.nextInt();
        System.out.print("Enter the 'b' coefficient of the quadratic: ");
        int b = console.nextInt();
        System.out.print("Enter the 'c' coefficient of the quadratic: ");
        int c = console.nextInt();

        // Find the two roots
        double squareRoot = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double root1 = (-b + squareRoot) / (2 * a);
        double root2 = (-b - squareRoot) / (2 * a);

        // Display roots
        System.out.println("\nRoot 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}

/*
Output:

Enter the 'a' coefficient of the quadratic: 2
Enter the 'b' coefficient of the quadratic: -5
Enter the 'c' coefficient of the quadratic: -3

Root 1: 3.0
Root 2: -0.5



*/
