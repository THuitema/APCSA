package com.thuitema.Unit_5;

// This is the driver class because it contains the main method
public class Pd8ThomasHuitemaDate {
    public static void main(String[] args) {
        Date myBirthday = new Date(1, 20, 2005); // Uses non-default constructor to assign values immediately
        System.out.println(myBirthday);

    }
}

class Date {
    private int month;
    private int day;
    private int year;

    // Default constructor
    public Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    // Non-default constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String toString() {
        return "month: " + month + "\n" +
               "day: " + day + "\n" +
               "year: " + year;
    }

}
