package com.thuitema.Labs.Unit4;

/*
  Name: Thomas Huitema
  Period: 8
  Lab Name: Drug Potency Lab
  Purpose of Program: Determine how many months a drug can remain in storage

 What I Learned:
• Variables declared outside while loops can be called inside them
• Variables can be used in the conditional of while loops
• I had to move the first print statement before the loop in order to have
  the DISCARDED print statement on the last line of the loop while moving
  to the next line after each iteration

 */

public class Pd8ThomasHuitemaDrugPotency {
    public static void main(String[] args) {
        int month = 0;
        double effectiveness = 100.0;

        System.out.print("month: " + month + "    effectiveness: " + effectiveness);
        
        while (effectiveness >= 50.0) {
            System.out.println();
            month += 1;
            effectiveness -= effectiveness * 0.04;
            System.out.print("month: " + month + "    effectiveness: " + effectiveness);
        }

        System.out.print(" DISCARDED");
    }
}

/*
month: 0    effectiveness: 100.0
month: 1    effectiveness: 96.0
month: 2    effectiveness: 92.16
month: 3    effectiveness: 88.47359999999999
month: 4    effectiveness: 84.93465599999999
month: 5    effectiveness: 81.53726975999999
month: 6    effectiveness: 78.27577896959998
month: 7    effectiveness: 75.14474781081599
month: 8    effectiveness: 72.13895789838335
month: 9    effectiveness: 69.25339958244803
month: 10    effectiveness: 66.4832635991501
month: 11    effectiveness: 63.8239330551841
month: 12    effectiveness: 61.27097573297674
month: 13    effectiveness: 58.82013670365767
month: 14    effectiveness: 56.46733123551136
month: 15    effectiveness: 54.208637986090906
month: 16    effectiveness: 52.04029246664727
month: 17    effectiveness: 49.958680767981384 DISCARDED
 */


