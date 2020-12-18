package com.thuitema.Labs.Unit5;
/*
 * Name: Thomas Huitema
 * Period: 8
 * Lab Name: Quadratic Equation Lab
 * Purpose of Program: Learn how to design a class/data type based on how the class is being used in the client class
 */

import java.util.Scanner;

public class Pd8ThomasHuitemaQuadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int k = 1; k <= 3; k++) {
            System.out.print("Enter a, b, and c: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            QuadraticEquation q = new QuadraticEquation(a, b, c);

            if (q.noSolution()) {
                System.out.println("No real solution.");
            }
            else if (q.equalRoots()) {
                System.out.println("The only solution is: " + q.getSolution1());
            }
            else {
                System.out.println("The two real solutions are: ");
                System.out.println(q.getSolution1());
                System.out.println(q.getSolution2());
            }  // else
        }
    }
}

class QuadraticEquation {
        private int a;
        private int b;
        private int c;

        public QuadraticEquation() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }

        public QuadraticEquation(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getSolution1() {
            return (-b + Math.sqrt(findDiscriminant())) / (2 * a);
        }

        public double getSolution2() {
            return (-b - Math.sqrt(findDiscriminant())) / (2 * a);
        }

        public boolean noSolution() {
            return findDiscriminant() < 0;
        }

        public boolean equalRoots() {
            return getSolution1() == getSolution2();
        }

        // Private because it is only called inside other methods, not for use in user-objects
        private double findDiscriminant() {
            return Math.pow(b, 2) - 4 * a * c;
        }
}

/*
Enter a, b, and c: 1 5 8
No real solution.
Enter a, b, and c: 3 6 3
The only solution is: -1.0
Enter a, b, and c: 2 15 -8
The two real solutions are:
0.5
-8.0
 */

