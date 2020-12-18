package com.thuitema.Unit_3;

import java.util.Scanner;

public class FermatLastTheorem
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a, b, and c: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        System.out.print("Enter n: ");
        int n = console.nextInt();

        checkFermat(a, b, c, n);
    }

    public static void checkFermat(int a, int b, int c, int n)
    {
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n) && n > 2)
        {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else
        {
            System.out.println("No, that doesn't work.");
        }
    }
}
