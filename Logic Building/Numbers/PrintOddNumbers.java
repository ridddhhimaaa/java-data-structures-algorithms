/*
==================================================
Problem:
Print odd numbers from 1 to 99.

Difficulty:
Easy

Topic:
Numbers

Approach:
Step 1: Start with 1.
Step 2: Keep printing while the number is less than 100.
Step 3: Increase the number by 2 each time.

Algorithm:
Use a while loop to print only odd numbers in the range from 1 to 99.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class PrintOddNumbers {
    public static void main(String[] args) {
        int number = 1;

        while (number < 100) {
            System.out.println(number);
            number += 2;
        }
    }
}

/*
Sample Output

1
3
5
7
...
99
*/
