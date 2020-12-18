package com.thuitema.Unit_1;

public class September25 {

    public static void main (String[] args){
        System.out.println((double) 11 / 4); // Makes 11 double, double division
        System.out.println((double) (11 / 4)); // Does integer division first, then makes answer double

        // Order of Operations
        System.out.println(1 + 2 + "Friday!"); // 3Friday! - Adds then concatenates, left to right
        System.out.println("Friday" + 1 + 2); // Friday12 - Strings adds to 1 then 2
        System.out.println("Friday" + 1 * 2); // Friday2 - Multiplies first, concatenates with string
        System.out.println();

        // Type casting
        int x = (int) 2.75; // (int) makes 2.75 an int before assigning it to int x; doesn't work without (int)
        double z = (double) 2; // Makes 2 a double before assignment

        // Unary operators
        int a = 5;

        int b = 3 + a++; // Post increment - 3 + a then a + 1 after equation
        int c = 3 + ++a; // Pre increment -  a + 1 then 3 + a
        System.out.println(b);
        System.out.println(c);


    }
}
