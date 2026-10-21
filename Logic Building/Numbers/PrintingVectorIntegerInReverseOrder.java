/*
==================================================
Problem:
Print the elements of an integer array in reverse order.

Difficulty:
Easy

Topic:
Arrays

Approach:
Step 1: Store the array values.
Step 2: Start at the last valid index.
Step 3: Print each element while moving toward index zero.

Algorithm:
Traverse the array backward from arr.length - 1 to 0 without modifying
the original array.

Time Complexity:
O(n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class PrintingVectorIntegerInReverseOrder {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Reverse Order : ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

        /*
        Sample Output

        Reverse Order : 5 4 3 2 1
        */
        System.out.println();
    }
}
