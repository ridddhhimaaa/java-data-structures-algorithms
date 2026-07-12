/*
==================================================
Problem:
Calculate the total cost of items.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Store the number of items.
Step 2: Store the cost per item.
Step 3: Multiply both values to get the total cost.
Step 4: Print the result.

Algorithm:
Multiply the quantity by the cost per item and display the amount with a currency symbol.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class ItemCostCalculator {
    public static void main(String[] args) {
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print the calculation details
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost: " + totalCost + currency);
    }
}

/*
Sample Output

Number of items: 50
Cost per item: 9.99$
Total cost: 499.5$
*/
