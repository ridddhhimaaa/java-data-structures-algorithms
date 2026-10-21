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
Step 4: Print the final sum.

Algorithm:
Use a for loop to accumulate the values in the inclusive range from 1
to n.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}

/*
Sample Input

5

Sample Output

Enter the number of terms: 5
Sum = 15
*/
