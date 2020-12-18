package com.thuitema.Unit_3;

import java.util.Scanner;

public class Quadrants {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a pair of coordinates (x y): ");
        double x = console.nextDouble();
        double y = console.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("Quadrant 1");
        }
        else if (x < 0 && y > 0){
            System.out.println("Quadrant 2");
        }
        else if (x < 0 && y < 0){
            System.out.println("Quadrant 3");
        }
        else if (x > 0 && y < 0){
            System.out.println("Quadrant 4");
        }
        else if (x == 0 && y != 0){
            System.out.println("On y-axis");
        }
        else if (x != 0 && y == 0){
            System.out.println("On x-axis");
        }
        else {
            System.out.println("Point is on origin");
        }
    }
}
