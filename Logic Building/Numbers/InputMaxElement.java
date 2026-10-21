/*
==================================================
Problem:
Read an integer array and find its maximum value.

Difficulty:
Easy

Topic:
Arrays, Input Handling

Approach:
Step 1: Read the number of array elements.
Step 2: Read the first element and use it as the initial maximum.
Step 3: Read the remaining elements and update the maximum when needed.
Step 4: Print the maximum value.

Algorithm:
Perform a linear scan while maintaining the largest value seen so far.
Reject a non-positive array size because an empty array has no maximum.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
import java.util.Scanner;

public class InputMaxElement {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int length = scanner.nextInt();
            if (length <= 0) {
                System.out.println("Array must contain at least one element.");
                return;
            }

            System.out.print("Enter the elements: ");
            int maximum = scanner.nextInt();
            for (int i = 1; i < length; i++) {
                int value = scanner.nextInt();
                if (value > maximum) {
                    maximum = value;
                }
            }
            System.out.println("Maximum element: " + maximum);
        }
    }
}

/*
Sample Input

5
1 2 3 4 5

Sample Output

Enter the number of elements: 5
Enter the elements: Maximum element: 5
*/
