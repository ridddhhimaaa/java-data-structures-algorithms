/*
==================================================
Problem:
Print a greeting with a first and last name.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Store the first and last names.
Step 2: Join the names with a space.
Step 3: Print the full greeting.

Algorithm:
Use string concatenation to display a personalized greeting with the full name.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class FullNameGreeting {
    public static void main(String[] args) {
        String firstName = "Riddhima";
        String lastName = "Rai";

        // Combine first and last name in a readable way
        System.out.println("Hello, " + firstName + " " + lastName);
    }
}

/*
Sample Output

Hello, Riddhima Rai
*/
