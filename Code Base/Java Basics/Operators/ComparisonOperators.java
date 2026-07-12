/*
==================================================
Problem:
Demonstrate comparison operators in Java.

Difficulty:
Easy

Topic:
Operators

Approach:
Step 1: Store two numbers.
Step 2: Compare them using relational operators.
Step 3: Print the boolean results.

Algorithm:
Use comparison operators to check equality and ordering between two integers.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class ComparisonOperators {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        // Comparison operators
        System.out.println("Comparison operators");
        System.out.print("Equal to: ");
        System.out.println(firstNumber == secondNumber);
        System.out.print("Not equal to: ");
        System.out.println(firstNumber != secondNumber);
        System.out.print("Greater than: ");
        System.out.println(firstNumber > secondNumber);
        System.out.print("Less than: ");
        System.out.println(firstNumber < secondNumber);
        System.out.print("Greater than or equal to: ");
        System.out.println(firstNumber >= secondNumber);
        System.out.print("Less than or equal to: ");
        System.out.println(firstNumber <= secondNumber);
    }
}

/*
Sample Output

Comparison operators
Equal to: false
Not equal to: true
Greater than: false
Less than: true
Greater than or equal to: false
Less than or equal to: true
*/
