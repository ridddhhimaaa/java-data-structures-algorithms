/*
==================================================
Problem:
Find the maximum element in an integer array.

Difficulty:
Easy

Topic:
Arrays

Approach:
Step 1: Store the array values.
Step 2: Use the first element as the initial maximum.
Step 3: Compare each remaining element with the current maximum.
Step 4: Print the largest value after the traversal.

Algorithm:
Traverse the array once and replace the current maximum whenever a
larger element is found.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class FindMaxUsingVector{
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        if (arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            /*
            Sample Output

            Maximum element in the array is: 5
            */
        }
        System.out.println("Maximum element in the array is: " + max);
    }
}