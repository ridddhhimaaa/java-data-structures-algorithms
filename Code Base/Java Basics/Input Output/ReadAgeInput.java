import java.util.Scanner;

/*
==================================================
Problem:
Read an age from the user and print it.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Create a Scanner object.
Step 2: Read the age from the keyboard.
Step 3: Print the entered value.
Step 4: Close the Scanner.

Algorithm:
Use Scanner.nextInt() to capture an integer from the console and display it back to the user.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class ReadAgeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their age
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        // Print the entered age
        System.out.println("Age: " + age);

        scanner.close();
    }
}

/*
Sample Output

Enter your age: 20
Age: 20
*/