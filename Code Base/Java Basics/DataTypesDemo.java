/*
==================================================
Problem:
Demonstrate Java primitive and reference data types.

Difficulty:
Easy

Topic:
Java Basics

Approach:
Step 1: Declare variables of different data types.
Step 2: Assign sample values to each variable.
Step 3: Print every value with a label.

Algorithm:
Create variables for numeric, decimal, boolean, character, and string values, then print them to show how Java stores each type.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class DataTypesDemo {
    public static void main(String[] args) {
        byte smallNumber = 100;
        short mediumNumber = 5000;
        int largeNumber = 100000;
        long veryLargeNumber = 1500000000L;
        float floatNumber = 3.25f;
        double doubleNumber = 3.141592653589793;
        float scientificFloat = 35e3f;
        double scientificDouble = 12E4d;
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        char grade = 'A';
        String name = "Riddhima Rai";

        System.out.println("Byte: " + smallNumber);
        System.out.println("Short: " + mediumNumber);
        System.out.println("Int: " + largeNumber);
        System.out.println("Long: " + veryLargeNumber);
        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Float (Scientific): " + scientificFloat);
        System.out.println("Double (Scientific): " + scientificDouble);
        System.out.println("Boolean (Java is fun): " + isJavaFun);
        System.out.println("Boolean (Fish is tasty): " + isFishTasty);
        System.out.println("Character: " + grade);
        System.out.println("String: " + name);
    }
}

/*
Sample Output

Byte: 100
Short: 5000
Int: 100000
Long: 1500000000
Float: 3.25
Double: 3.141592653589793
Float (Scientific): 35000.0
Double (Scientific): 120000.0
Boolean (Java is fun): true
Boolean (Fish is tasty): false
Character: A
String: Riddhima Rai
*/
