package com.thuitema.Unit_1;
import java.util.Scanner;

public class September18 {

    public static void main (String[] args) {
        /* Scanner class - user input
           3 Steps:
           import java.util.Scanner;
           Scanner input = new Scanner(System.in);
           input.nextInt(), input.nextDouble(), input.nextLine() Create variables from input

         */

        Scanner gpaInput = new Scanner(System.in); // input is a variable name, can be anything
        Scanner nameInput = new Scanner(System.in);

        System.out.println("What's your GPA? ");
        double gpa = gpaInput.nextDouble(); // Creates a double variable from the input
        System.out.println("What's your name? ");
        String name = nameInput.nextLine(); // Creates a String variable from the input
        System.out.println(name + " has a GPA of " + gpa);
        System.out.println();

        // Rounding Numbers
        double n = -1.9;
        n = n - 0.5;
        int rounded = (int) n;
        System.out.println(rounded);

    }
}
