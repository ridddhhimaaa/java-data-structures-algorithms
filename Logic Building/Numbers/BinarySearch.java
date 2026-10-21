/*
==================================================
Problem:
Search for a target value in a sorted array using binary search.

Difficulty:
Easy

Topic:
Searching, Arrays

Approach:
Step 1: Initialize the search interval to the complete sorted array.
Step 2: Compare the target with the middle element.
Step 3: Discard the half that cannot contain the target.
Step 4: Stop when the target is found or the interval is empty.

Algorithm:
Use iterative binary search on the sorted array and report the index
when the target is found.

Time Complexity:
O(log n)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int key = 3;
        int low = 0;
        int high = arr.length - 1;
        int foundIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                foundIndex = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            /*
            Sample Output

            Element found in the array at index 2
            */
        }
        if (foundIndex >= 0) {
            System.out.println("Element found in the array at index " + foundIndex);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
