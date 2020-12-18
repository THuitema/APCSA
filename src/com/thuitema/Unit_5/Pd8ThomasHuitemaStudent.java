package com.thuitema.Unit_5;

import java.util.Scanner;

// Driver class
public class Pd8ThomasHuitemaStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting user input to display
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Student ID: ");
        int studentID = scanner.nextInt();

        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        Student user = new Student(name, studentID, gpa);

        System.out.println();
        System.out.println(user);

    }
}

// Student object class
class Student {
    private String name;
    private int studentID;
    private double gpa;

    // Default constructor, assigns the given values below
    public Student() {
        name = " ";
        studentID = 0;
        gpa = 0.0;
    }

    // Non-default constructor, assigns arguments given when creating an object
    public Student(String name, int studentID, double gpa) {
        // 'this' is used to avoid confusion between instance vars and parameters
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Student ID: " + studentID + "\n" +
                "GPA: " + gpa;
    }
}

/*
Name: John Doe
Student ID: 11223344
GPA: 3.78

Name: Jane Doe
Student ID: 12341234
GPA: 4.0
 */