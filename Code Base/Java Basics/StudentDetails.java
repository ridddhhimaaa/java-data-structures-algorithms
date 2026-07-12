/*
==================================================
Problem:
Print basic student details.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Store the student details in variables.
Step 2: Keep each value in an appropriate data type.
Step 3: Print the details with labels.

Algorithm:
Create variables for a student's profile and print them in a readable format.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class StudentDetails {
    public static void main(String[] args) {
        String name = "Ridhhima Rai";
        int age = 20;
        int studentId = 12308762;
        float cgpa = 6.82f;
        float fees = 50000.00f;
        char section = 'A';
        boolean isHosteller = true;

        // Print the student details one by one
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + studentId);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Fees: " + fees);
        System.out.println("Section: " + section);
        System.out.println("Is Hosteller: " + isHosteller);
    }
}

/*
Sample Output

Name: Ridhhima Rai
Age: 20
ID: 12308762
CGPA: 6.82
Fees: 50000.0
Section: A
Is Hosteller: true
*/
