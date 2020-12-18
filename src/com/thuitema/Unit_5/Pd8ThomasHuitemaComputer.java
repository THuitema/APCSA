package com.thuitema.Unit_5;


public class Pd8ThomasHuitemaComputer {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Apple", "Macbook Air", 2018);
        System.out.println(myComputer);
        System.out.println();

        myComputer.setModel("Mac Pro");
        System.out.println(myComputer);
    }
}

class Computer {
    // Fields
    private String brand;
    private String model;
    private int year;

    // Constructors
    public Computer() {
        brand = "";
        model = "";
        year = 0;
    }

    public Computer(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Accessor methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Modifier methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Other methods
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Model: " + model + "\n" +
                "Year: " + year;
    }

    public boolean isNew() {
        return year > 2017;
    }
}
