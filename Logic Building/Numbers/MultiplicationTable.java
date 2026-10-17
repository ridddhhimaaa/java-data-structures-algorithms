/*
==================================================
Problem:
Print the multiplication table for a user-provided number from 1 to 10.

Difficulty:
Easy

Topic:
Numbers, Loops, Input

Approach:
Step 1: Read a number from the user.
Step 2: Start a counter at 1.
Step 3: Multiply the number by the counter and print the result.
Step 4: Increase the counter until the tenth multiple is printed.

Algorithm:
Use a while loop to calculate and print ten multiples of the input number.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int multiplier = 1;

        while (multiplier <= 10) {
            System.out.println(number + " x " + multiplier + " = " + number * multiplier);
            multiplier++;
        }

        scanner.close();
    }
}

/*
Sample Input

5

Sample Output

Enter the number: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
*/
