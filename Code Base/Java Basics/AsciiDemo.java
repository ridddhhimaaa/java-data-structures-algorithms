/*
==================================================
Problem:
Print ASCII values as characters.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Store ASCII codes in integer variables.
Step 2: Convert each code to a character.
Step 3: Print the character values.

Algorithm:
Use the ASCII codes for A and B, cast them to char, and display the results on the console.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class AsciiDemo {
    public static void main(String[] args) {
        // Store ASCII codes for the letters
        int asciiA = 65;
        int asciiB = 66;

        // Cast the codes to characters before printing
        System.out.println((char) asciiA);
        System.out.println((char) asciiB);
    }
}

/*
Sample Output

A
B
*/
