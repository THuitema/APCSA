package com.thuitema.Labs.Unit1;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Rectangle Lab
  Purpose of Program: Output the area and perimeter of a rectangle given the dimensions from user input

 What I Learned:
 • How to import the Scanner class
 • How to take in integers as input (nextInt)
 • How to add and multiply variables
 • String concatenation

 */

import java.util.Scanner;

public class Pd8ThomasHuitemaRectangle
{

    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        int width, length, area, perimeter;

        // Prompting user for width and length inputs
        System.out.println("Enter the width: ");
        width = console.nextInt();
        System.out.println("Enter the length: ");
        length = console.nextInt();

        // Calculating area and perimeter
        perimeter = (length * 2) + (width * 2);
        area = length * width;

        // Display results
        System.out.println("The rectangle's area is " + area);
        System.out.println("The rectangle's perimeter is " + perimeter);
    }
}

/* Program Output:

Enter the width: 5
Enter the length: 10
The rectangle's area is 50
The rectangle's perimeter is 30

 */
