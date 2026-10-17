/*
==================================================
Problem:
Read a user's name and age, then display both values.

Difficulty:
Easy

Topic:
Java Basics, Input

Approach:
Step 1: Create a Scanner to read console input.
Step 2: Read the user's name as a complete line.
Step 3: Read the user's age as an integer.
Step 4: Print the captured values with labels.

Algorithm:
Use Scanner.nextLine() for the name and Scanner.nextInt() for the age,
then print both values.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        scanner.close();
    }
}

/*
Sample Input

Riddhima Rai
20

Sample Output

Enter your name: Riddhima Rai
Enter your age: 20
Name: Riddhima Rai
Age: 20
*/
