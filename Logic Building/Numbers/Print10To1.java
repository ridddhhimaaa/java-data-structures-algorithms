/*
==================================================
Problem:
Print numbers from 10 to 1.

Difficulty:
Easy

Topic:
Numbers

Approach:
Step 1: Start from 10.
Step 2: Keep printing while the number is at least 1.
Step 3: Decrease the number by 1 after each print.

Algorithm:
Use a for loop to count downward from 10 to 1 and print each value.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class Print10To1 {
    public static void main(String[] args) {
        for (int number = 10; number >= 1; number--) {
            System.out.println(number);
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
