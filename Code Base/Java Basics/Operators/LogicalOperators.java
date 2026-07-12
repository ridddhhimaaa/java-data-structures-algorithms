/*
==================================================
Problem:
Demonstrate logical operators in Java.

Difficulty:
Easy

Topic:
Operators

Approach:
Step 1: Store boolean values.
Step 2: Apply AND, OR, and NOT operators.
Step 3: Print each result.

Algorithm:
Use logical operators to combine or negate boolean expressions.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class LogicalOperators {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular User: " + (isLoggedIn && isAdmin));
        System.out.println("Has Access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + !isLoggedIn);
    }
}

/*
Sample Output

Regular User: false
Has Access: true
Not logged in: false
*/
