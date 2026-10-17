/*
==================================================
Problem:
Print all even numbers from 2 to 100.

Difficulty:
Easy

Topic:
Numbers, Loops

Approach:
Step 1: Initialize the counter to 2, the first even number.
Step 2: Continue while the counter is at most 100.
Step 3: Print the counter.
Step 4: Increase the counter by 2 to reach the next even number.

Algorithm:
Use a while loop to print even numbers from 2 through 100 by increasing
the counter by 2 after each iteration.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class PrintEvenNumbers {
    public static void main(String[] args) {
        int number = 2;

        while (number <= 100) {
            System.out.println(number);
            number += 2;
        }
    }
}

/*
Sample Output

2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100
*/
