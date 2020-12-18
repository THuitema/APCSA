package com.thuitema.Unit_4;

import java.util.Scanner;

public class LoopReview {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

//        System.out.print("Enter n: ");
//        int n = console.nextInt();
//        inverted(n); // Inverted Triangle
//        System.out.println();
//        triangle(n); // Normal Triangle
        doubleTriangle(6);

    }

    public static void doubleTriangle(int n){
        int numStars = n * 2;
        int numLines = numStars / 2;

        for (int i = 1; i <= numLines; i++){
            for (int s = 1; s < i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= numStars; j++){
                System.out.print("*");
            }

            numStars -= 2;
            System.out.println();
        }

    }

    public static void inverted(int n){
        int temp = n;

        // Figures out how many lines to print, 1 more if n is odd
        if (n % 2 == 0){
            n = n / 2;
        }
        else {
            n = n / 2 + 1;
        }

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Stars
            for(int s = 1; s <= temp; s++){
                System.out.print("*");
            }

            temp -= 2;
            System.out.println();
        }
    }

    public static void triangle(int n){
        int temp;

        if (n % 2 == 0){
            n = n / 2;
            temp = 2;
        }
        else {
            n = n / 2 + 1;
            temp = 1;
        }

        for (int i = 1; i <= n; i++){
            // Spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int s = 1; s <= temp; s++){
                System.out.print("*");
            }

            System.out.println();
            temp += 2;
        }
    }

}
