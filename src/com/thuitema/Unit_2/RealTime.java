package com.thuitema.Unit_2;

import java.util.Scanner;

public class RealTime {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter time in seconds: ");
        int seconds = console.nextInt();

        realTime(seconds);
    }

    public static void realTime(int seconds)
    {
        int numHours = seconds / 3600;
        int numMinutes = seconds % 3600 / 60; //20
        int numSeconds = seconds % 3600 % 60;

        System.out.println("Hours: " + numHours);
        System.out.println("Minutes: " + numMinutes);
        System.out.println("Seconds: " + numSeconds);

    }
}

/*
Output:
Enter time in seconds: 5678
Hours: 1
Minutes: 34
Seconds: 38
 */
