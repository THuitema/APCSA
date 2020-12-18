package com.thuitema.Labs.Unit3;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Slope Lab
  Purpose of Program: Calculate the slope of a line provided the coordinates of two points

 What I Learned:
• Receiving multiple inputs on the same line
• Using if, else if, and else statements
• Using nested if statements
• Using boolean expression inside conditional statements

 */

import java.util.Scanner;

public class Pd8ThomasHuitemaSlope
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        // Getting coordinates
        System.out.print("Enter the coordinates of point 1 (x y): ");
        double x1 = console.nextDouble();
        double y1 = console.nextDouble();

        System.out.print("Enter the coordinates of point 2 (x y): ");
        double x2 = console.nextDouble();
        double y2 = console.nextDouble();

        System.out.println();

        // Calculate slope and detect if line is horizontal or vertical
        findSlope(x1, y1, x2, y2);
    }

    public static void findSlope(double x1, double y1, double x2, double y2)
    {
        double numerator = y2 - y1;
        double denominator = x2 - x1;
        double slope = numerator / denominator;
        double b = y1 - slope * x1;

        if (denominator == 0) // Vertical line
        {
            System.out.println("Alert! The line is vertical.");
            System.out.println("Equation of the line: x = " + x1);
        }

        else if (numerator == 0) // Horizontal line
        {
            System.out.println("Alert! The line is horizontal.");
            System.out.println("Equation of the line: y = " + y1);
        }

        else // Defined line
        {
            if (b > 0)
            {
                // Adds b to the end since it is positive
                System.out.println("Equation of the line: y = " + slope + "x + " + b);
            }

            if (b == 0)
            {
                // Doesn't include b since it is 0
                System.out.println("Equation of the line: y = " + slope + "x");
            }

            if (b < 0)
            {
                // Subtracts positive b at the end to avoid + - or - - from happening
                System.out.println("Equation of the line: y = " + slope + "x - " + -b);
            }
        }
    }
}

/*
Sample Output:
FIRST RUN:
Enter the coordinates of point 1 (x y): 4 6
Enter the coordinates of point 2 (x y): 8 16

Equation of the line: y = 2.5x - 4.0

SECOND RUN:
Enter the coordinates of point 1 (x y): -3 7
Enter the coordinates of point 2 (x y): 5 7

Alert! The line is horizontal.
Equation of the line: y = 7.0

THIRD RUN:
Enter the coordinates of point 1 (x y): 2 -2
Enter the coordinates of point 2 (x y): 2 6

Alert! The line is vertical.
Equation of the line: x = 2.0
*/
