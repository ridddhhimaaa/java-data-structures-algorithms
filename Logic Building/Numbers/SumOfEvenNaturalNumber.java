/*
==================================================
Problem:
Calculate the sum of all even natural numbers from 1 through n.

Difficulty:
Easy

Topic:
Numbers, Loops, Input Handling

Approach:
Step 1: Read the upper limit n.
Step 2: Visit each integer from 1 through n.
Step 3: Add only values divisible by two.
Step 4: Print the sum.

Algorithm:
Use a loop and an evenness check to accumulate every even number in the
inclusive range from 1 to n.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
import java.util.Scanner;
public class SumOfEvenNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

/*
Sample Input

10

Sample Output

30
*/
