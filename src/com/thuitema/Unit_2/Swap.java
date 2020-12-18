package com.thuitema.Unit_2;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = console.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = console.nextInt();

        swap(num1, num2);

    }

    public static void swap(int num1, int num2)
    {
        System.out.println(num2 + " " + num1);

    }
}

/*
Output:
Enter the first number: 10
Enter the second number: 2
2 10
 */
