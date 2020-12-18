package com.thuitema.Unit_4;

public class Worksheet4 {
    public static void main(String[] args) {
        for (int i = 3; i <= 24; i *= 2){
            System.out.println(i);
        }
        for (int i = 24; i >= 3; i /= 2){
            System.out.println(i);
        }

        int x = 0;
        for (int p = 9; p <= 145; p++){
            x++;
        }
        System.out.println(x); // Iterates 137 times
    }
}
