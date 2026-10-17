/*
==================================================
Problem:
Print numbers from 10 to 1.

Difficulty:
Easy

Topic:
Numbers, Loops

Approach:
Step 1: Initialize the counter to 10.
Step 2: Continue while the counter is at least 1.
Step 3: Print the counter.
Step 4: Decrease the counter by 1.

Algorithm:
Use a while loop to print each integer from 10 down to 1.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class Print10To1{
    public static void main(String[] args){
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
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