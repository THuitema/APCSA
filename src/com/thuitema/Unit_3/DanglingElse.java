package com.thuitema.Unit_3;

public class DanglingElse {
    public static void main(String[] args) {
        int aNumber = 3;

        if (aNumber >= 0)
            if (aNumber == 0) System.out.println("first string"); // Inside first if
            else System.out.println("second string"); // Inside first if, part of second if
        System.out.println("third string"); // Outside all if statements, is always called
    }
}

/*
Output:

second string
third string
*/
