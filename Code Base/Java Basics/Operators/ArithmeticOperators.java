/*
==================================================
Problem:
Demonstrate arithmetic and increment/decrement operators in Java.

Difficulty:
Easy

Topic:
Operators

Approach:
Step 1: Store sample integer values.
Step 2: Apply arithmetic operators.
Step 3: Apply increment and decrement.
Step 4: Repeat the same idea with decimal values.

Algorithm:
Use arithmetic, increment, decrement, and decimal calculations to show how operators work on different numeric types.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class ArithmeticOperators {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 3;

        // Arithmetic operators
        System.out.println("Arithmetic operators");
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber % secondNumber);

        // Increment and decrement operators
        int count = 5;
        System.out.println("Increment and Decrement operators");

        ++count;
        // The value becomes 6 after increment
        System.out.println(count);

        --count;
        // The value becomes 5 after decrement
        System.out.println(count);

        // Decimal values
        double decimalA = 10.0d;
        double decimalB = 3.0d;
        System.out.println("Decimal values");
        System.out.println(decimalA + decimalB);
        System.out.println(decimalA - decimalB);
        System.out.println(decimalA * decimalB);
        System.out.println(decimalA / decimalB);
        System.out.println(decimalA % decimalB);
    }
}

/*
Sample Output

Arithmetic operators
13
7
30
3
1
Increment and Decrement operators
6
5
Decimal values
13.0
7.0
30.0
3.3333333333333335
1.0
*/
