package com.thuitema.Unit_1;

import java.util.Scanner;

public class September23 {

    public static void main(String[] args){

        System.out.println((int)(1.8 * 2.0)); // Makes an int of everything in equation
        System.out.println((int) 1.8 * 2.0); // Makes int of just first number
        System.out.println((double) 3/4); // 3.0 / 4
        System.out.println((double)(3/4)); // Integer division first, then makes it a double
        System.out.println((int)(Math.PI));
        System.out.println();

        double ans = ((Math.sqrt(9 % 5) + 1.5));
        System.out.println(ans);

        double num1 = 2.01;
        num1 = Math.pow(num1, 3);
        num1 = Math.round(num1);
        System.out.println(num1);

        int num2 = 25;
        num2 = (int) Math.sqrt(num2);
        System.out.println(num2);

        System.out.println(5 + "4" + 3 + 2 + 1 + " blastoff"); // 54321 blastoff
        System.out.println("What expression " + 3 * 2 % 5 + 1 + " is this?"); // What expression 11 is this?
        System.out.println(" " + 0 + 0 + 0 + 0 + 0 + " SCARY");
        System.out.println();

        int m = 6;
        int b = 7;
        int result = b * ++m;
        System.out.println(result);


        System.out.println(Math.abs(-12) != Math.round(12.5));
        System.out.println();
        System.out.println();

        // Cylinder calculator
        System.out.println("Cylinder Calculator");
        Scanner console = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = console.nextInt();
        radius = Math.abs(radius);

        System.out.print("Enter height: ");
        int height = console.nextInt();
        height = Math.abs(height);

        System.out.print("Enter unit of measure: ");
        String units = console.next();

        double formulaWithoutPi = Math.pow(radius, 2) * height;
        double formulaWithPi = formulaWithoutPi * Math.PI;
        System.out.println("\nThe exact volume of this cylinder is " + (int)formulaWithoutPi + "pi square " + units);
        System.out.println("\nAs a rounded whole number, the volume of this cylinder is " + Math.round(formulaWithPi) + " square " + units);
        System.out.println("\nThe greatest number of whole square " + units + " that can fit inside the cylinder is " + (int)formulaWithPi);





    }
}
