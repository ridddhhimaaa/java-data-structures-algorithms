/*
==================================================
Problem:
Demonstrate assignment operators in Java.

Difficulty:
Easy

Topic:
Operators

Approach:
Step 1: Start with an initial value.
Step 2: Apply each assignment operator one by one.
Step 3: Print the updated value after each operation.

Algorithm:
Use compound assignment operators to update a variable and show how each operator changes the stored value.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class AssignmentOperators {
    public static void main(String[] args) {
        int value = 5;

        System.out.println("Assignment Operators");

        // Assign a new value
        value = 5;
        System.out.println(value);

        value = 6;
        System.out.println(value);

        // Add and subtract
        value += 5;
        System.out.println(value);

        value -= 3;
        System.out.println(value);

        // Multiply and divide
        value *= 2;
        System.out.println(value);

        value /= 2;
        System.out.println(value);

        // Find the remainder
        value %= 3;
        System.out.println(value);

        // Bitwise and shift assignment operators
        value = 6;
        value &= 3;
        System.out.println(value);

        value = 6;
        value |= 3;
        System.out.println(value);

        value = 6;
        value >>= 3;
        System.out.println(value);

        value = 6;
        value <<= 2;
        System.out.println(value);

        value = 6;
        value ^= 3;
        System.out.println(value);
    }
}

/*
Sample Output

Assignment Operators
5
6
11
8
16
8
2
2
7
0
24
5
*/
