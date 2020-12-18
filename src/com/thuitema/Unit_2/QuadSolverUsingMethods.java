package com.thuitema.Unit_2;

/*

Name: Thomas Huitema
Period: 8
Date: 10/2
Project: Worksheet 0B QuadSolverUsingMethods

*/

import java.util.Scanner;

public class QuadSolverUsingMethods {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        // Get coefficients from user
        System.out.print("Enter the 'a' coefficient of the quadratic: ");
        int a = console.nextInt();
        System.out.print("Enter the 'b' coefficient of the quadratic: ");
        int b = console.nextInt();
        System.out.print("Enter the 'c' coefficient of the quadratic: ");
        int c = console.nextInt();

        if (equalRoots(a, b, c)) {
            System.out.println("Root: " + (-b / (2.0 * a)));
        }
        else {
            System.out.println("Root 1: " + findRoot(a, b, c, true));
            System.out.println("Root 2: " + findRoot(a, b, c, false));
        }
    }

    public static boolean equalRoots(int a, int b, int c) {
        // If discriminant is 0, roots are equal
        return findDiscriminant(a, b, c) == 0;
    }

    public static double findRoot(int a, int b, int c, Boolean plus) {
        double root;

        if (plus) {
            root = (-b + Math.sqrt(findDiscriminant(a, b, c))) / (2 * a);
        }
        else {
            root = (-b - Math.sqrt(findDiscriminant(a, b, c))) / (2 * a);
        }

        return root;
    }

    public static double findDiscriminant(int a, int b, int c) {
        return Math.pow(b, 2) - 4 * a * c;
    }
}

/*
Sample Output:

Enter the 'a' coefficient of the quadratic: 1
Enter the 'b' coefficient of the quadratic: -6
Enter the 'c' coefficient of the quadratic: -16
Root 1: 8.0
Root 2: -2.0

 */