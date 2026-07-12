/*
==================================================
Problem:
Print numbers from 10 to 1 using a while loop.

Difficulty:
Easy

Topic:
Loops

Approach:
Step 1: Start with 10.
Step 2: Keep printing while the value is at least 1.
Step 3: Decrease the value by 1 after each print.

Algorithm:
Use a while loop to count down from 10 to 1 and display each value.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class WhileLoopCounter {
    public static void main(String[] args) {
        int number = 10;

        // Continue until the counter reaches 1
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

/*
Sample Output

10
9
8
7
6
5
4
3
2
1
*/


