package com.thuitema.Unit_3;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the length of the first stick: ");
        int stick1 = console.nextInt();
        System.out.print("Enter the length of the second stick: ");
        int stick2 = console.nextInt();
        System.out.print("Enter the length of the third stick: ");
        int stick3 = console.nextInt();

        boolean result = isTriangle(stick1, stick2, stick3);
        System.out.println(result);

    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
