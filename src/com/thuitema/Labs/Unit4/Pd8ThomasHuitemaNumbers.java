package com.thuitema.Labs.Unit4;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Perfect and Amicable Numbers Lab -- NOT REQUIRED
  Purpose of Program: Determine how many months a drug can remain in storage

 What I Learned:
 • Nested for loops
 */

public class Pd8ThomasHuitemaNumbers {
    public static void main(String[] args) {
        // Perfect Numbers
        System.out.print("Perfect numbers between 2 and 500 inclusive are: ");
        for(int i = 2; i <= 500; i++){
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }

        // Amicable Pairs
        System.out.println("\nAmicable pairs between 2 and 500 inclusive are: ");
        for(int n = 2; n <= 500; n++){
            for(int j = 2; j <= 500; j++){
                if (aliquotSum(n) == j && aliquotSum(j) == n) {
                    System.out.println(n + ", " + j);
                }
            }
        }
    }

    public static int aliquotSum(int n) {
        int sum = 0;

        for(int i = 1; i < n; i++) {
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n){
        return aliquotSum(n) == n;
    }
}
