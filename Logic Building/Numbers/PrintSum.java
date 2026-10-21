/*
==================================================
Problem:
Calculate the sum of the first n natural numbers.

Difficulty:
Easy

Topic:
Numbers, Loops, Input Handling

Approach:
Step 1: Read the number of terms from the user.
Step 2: Initialize the sum to zero.
Step 3: Add every integer from 1 through n.
Step 4: Print the accumulated sum.

Algorithm:
Use a for loop to add the natural numbers in the inclusive range 1 to n.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms: ");
            int sum = 0;
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            /*
            Sample Input

            5

            Sample Output

            Enter the number of terms: 5
            Sum = 15
            */
            System.out.println("Sum = " + sum);
        }
    }
}