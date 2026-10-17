/*
==================================================
Problem:
Print all odd numbers from 1 to 99.

Difficulty:
Easy

Topic:
Numbers, Loops

Approach:
Step 1: Initialize the counter to 1, the first odd number.
Step 2: Continue while the counter is less than 100.
Step 3: Print the counter.
Step 4: Increase the counter by 2 to reach the next odd number.

Algorithm:
Use a while loop to print odd numbers from 1 through 99 by increasing
the counter by 2 after each iteration.

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
9
11
13
15
17
19
21
23
25
27
29
31
33
35
37
39
41
43
45
47
49
51
53
55
57
59
61
63
65
67
69
71
73
75
77
79
81
83
85
87
89
91
93
95
97
99
*/
