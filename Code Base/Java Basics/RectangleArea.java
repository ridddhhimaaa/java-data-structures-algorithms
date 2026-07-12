/*
==================================================
Problem:
Calculate the area of a rectangle.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Store the length and breadth.
Step 2: Multiply both values.
Step 3: Print the result.

Algorithm:
Use the rectangle area formula, area = length x breadth, and display the answer.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class RectangleArea {
    public static void main(String[] args) {
        int length = 21;
        int breadth = 28;
        int area = length * breadth;

        // Print the values used in the calculation
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
    }
}

/*
Sample Output

Length: 21
Breadth: 28
Area: 588
*/
