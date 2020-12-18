package com.thuitema.Labs.Unit5;
/*
 * Name: Thomas Huitema
 * Period: 8
 * Lab Name: Car Class Lab
 * Purpose of Program: Practice writing classes containing accessor & modifier methods
 */

public class Pd8ThomasHuitemaCar {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla", 2019, 100.5, 22000);
        System.out.println(myCar);
        System.out.println();
        myCar.testDrive(10);
        myCar.setCost(19999);
        System.out.println(myCar);
    }
}

class Car {
    // Fields
    private String make;
    private int year;
    private double mileage;
    private double cost;

    // Constructors
    public Car() {
        make = "";
        year = 0;
        mileage = 0.0;
        cost = 0.0;
    }

    public Car(String make, int year, double mileage, double cost) {
        this.make = make;
        this.year = year;
        this.mileage = mileage;
        this.cost = cost;
    }

    public double testDrive(double milesDriven) {
        mileage += milesDriven;
        return mileage;
    }

    // Accessors
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public double getCost() {
        return cost;
    }

    // Modifiers
    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toString() {
        return "Make: " + make + "\n" +
                "Year: " + year + "\n" +
                "Mileage: " + mileage + "\n" +
                "Cost $: " + cost;

    }
}

/*
Make: Tesla
Year: 2019
Mileage: 100.5
Cost $: 22000.0

Make: Tesla
Year: 2019
Mileage: 110.5
Cost $: 19999.0
 */
