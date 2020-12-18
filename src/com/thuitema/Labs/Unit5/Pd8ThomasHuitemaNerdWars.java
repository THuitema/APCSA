package com.thuitema.Labs.Unit5;

/*
 * Name: Thomas Huitema
 * Period: 8
 * Lab Name: Nerd Wars Lab
 * Purpose of Program: Create a Warrior class that stores name, IQ, strength, and social clique.
 *
 * What I learned:
 * • In the equals method, the parameter type is "Warrior", not "Object"
 * • Char variables are surrounded in ' ', not " "
 * • You compare chars in the equals method with ".equals()" instead of "=="
 * • I learned how to use Math.random to generate random numbers based on a given minimum & maximum
 */

public class Pd8ThomasHuitemaNerdWars {
    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("Thomas", 'J');
        Warrior warrior2 = new Warrior("Evan", 'P');
        System.out.println(warrior1);
        System.out.println(warrior2);

        warrior1.fight(warrior2);
    }
}

class Warrior {
    private String name;
    private int IQ;
    private int strength;
    private char clique;

    // Precondition: String and char arguments must be given, with the char being N, J, P, T, or F
    // Postcondition: name, IQ, strength, and clique are assigned values
    public Warrior(String name, char clique) {
        this.name = name;
        this.clique = clique;
        generateStats(clique);
    }

    // Precondition: Another Warrior object is passed as an argument and both objects have name, strength, & IQ assigned
    // Postcondition: A winner is printed based on strength and IQ values
    public void fight(Warrior other) {
        if (this.IQ > other.getIQ() + 20) {
            System.out.println(this.name + " wins by IQ");
        }
        else if (other.getIQ() > this.IQ + 20) {
            System.out.println(other.getName() + " wins by IQ");
        }
        else if (this.strength > other.getStrength()) {
            System.out.println(this.name + " wins by strength");
        }
        else if (other.getStrength() > this.strength) {
            System.out.println(other.getName() + " wins by strength");
        }
        else {
            System.out.println("No winner");
        }
    }

    // Precondition: Another Warrior object is passed, all data fields are assigned
    // Postcondition: Returns if all data fields for both objects are equal
    public boolean equals(Warrior other) {
        return this.name.equals(other.getName()) &&
                this.clique == other.getClique() &&
                this.IQ == other.getIQ() &&
                this.strength == other.getStrength();
    }

    // Precondition: All data fields are assigned
    // Postcondition: Returns the data fields when called the object is called in a SOP
    public String toString() {
        return "Name: " + name + "\tClique: " + clique + "\tIQ: " + IQ + "\t Strength: " + strength;
    }

    // Precondition: name assigned of type String
    // Postcondition: returns the name
    public String getName() {
        return name;
    }

    // Precondition: clique is assigned of type char
    // Postcondition: returns the clique
    public char getClique() {
        return clique;
    }

    // Precondition: IQ is assigned of type int
    // Postcondition: returns IQ
    public int getIQ() {
        return IQ;
    }

    // Precondition: strength is assigned of type int
    // Postcondition: returns strength
    public int getStrength() {
        return strength;
    }

    // Precondition: name is initialized and a String argument is given
    // Postcondition: sets the name field as the parameter
    public void setName(String name) {
        this.name = name;
    }

    // Precondition: clique is initialized and a char argument is given
    // Postcondition: sets the clique field as the parameter
    public void setClique(char clique) {
        this.clique = clique;
    }

    // Precondition: IQ is initialized and an int argument is given
    // Postcondition: sets the IQ field as the parameter
    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    // Precondition: strength is initialized and an int argument is given
    // Postcondition: sets the strength field as the parameter
    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Precondition: A char is passed as an argument with a value of N, J, P, T, or F. IQ and strength have been initialized
    // Postcondition: IQ and strength are assigned a random value based on the clique
    private void generateStats(char clique) {
        // Nerd
        if (clique == 'N') {
            IQ = (int) (Math.random() * 61 + 120);
            strength = (int) (Math.random() * 61 + 20);
        }
        // Jock
        else if (clique == 'J') {
            IQ = (int) (Math.random() * 61 + 80);
            strength = (int) (Math.random() * 51 + 50);
        }
        // Prep
        else if (clique == 'P') {
            IQ = (int) (Math.random() * 61 + 90);
            strength = (int) (Math.random() * 51 + 40);
        }
        // Thug
        else if (clique == 'T') {
            IQ = (int) (Math.random() * 31 + 60);
            strength = (int) (Math.random() * 21 + 80);
        }
        // Freak
        else if (clique == 'F') {
        IQ = (int) (Math.random() * 121 + 60);
        strength = (int) (Math.random() * 100 + 1);
        }
    } // end of generateStats
} // end of Warrior

/*
Name: Thomas	Clique: P	IQ: 149	 Strength: 55
Name: Evan	Clique: F	IQ: 136	 Strength: 28
Thomas wins by strength

Name: Thomas	Clique: T	IQ: 84	 Strength: 97
Name: Evan	Clique: N	IQ: 172	 Strength: 54
Evan wins by IQ

Name: Thomas	Clique: J	IQ: 124	 Strength: 70
Name: Evan	Clique: P	IQ: 143	 Strength: 70
No winner
 */