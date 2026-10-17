/*
==================================================
Problem:
Print numbers from 1 to 10.

Difficulty:
Easy

Topic:
Numbers

Approach:
Step 1: Start from 1.
Step 2: Keep printing until the value reaches 10.
Step 3: Increase the value by 1 after every print.

Algorithm:
Use a while loop to print each integer from 1 through 10.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class Print1To10 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

/*
Sample Output

1
2
3
4
5
6
7
8
9
10
*/
