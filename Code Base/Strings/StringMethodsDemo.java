/*
==================================================
Problem:
Demonstrate common Java String methods.

Difficulty:
Easy

Topic:
Strings

Approach:
Step 1: Store sample strings.
Step 2: Apply a few common string methods.
Step 3: Print the results.

Algorithm:
Use length, charAt, case conversion, indexOf, equals, trim, and concat to show how String methods work.

Time Complexity:
O(1)

Space Complexity:
O(1)

Author:
Riddhima Rai

==================================================
*/
public class StringMethodsDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        // Find the length of the string
        String alphabet = "ABCDRFGHJIKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the string is: " + alphabet.length());

        // Find the character at a specific index
        String message = "Hello World";
        System.out.println("The character at index 0 is: " + message.charAt(0));

        // Convert to uppercase and lowercase
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // Find the index of a word
        String text = "please locate where 'locate' occurs !";
        System.out.println(text.indexOf("locate"));
        System.out.println(text.indexOf("locate", 8));

        // Compare strings
        String firstWord = "Hello";
        String secondWord = "Hello";
        String thirdWord = "Greetings";
        String fourthWord = "Greetings hello";
        System.out.println(firstWord.equals(secondWord));
        System.out.println(thirdWord.equals(fourthWord));

        // Remove whitespace from the beginning and end of a string
        String paddedText = "                 Hello World, Riddhima                       ";
        System.out.println(paddedText);
        System.out.println(paddedText.trim());

        // Concatenate strings
        String leftText = "Hello";
        String rightText = "World";
        System.out.println(leftText.concat(rightText));
        System.out.println(leftText + rightText);
    }
}

/*
Sample Output

Hello
The length of the string is: 26
The character at index 0 is: H
Uppercase: HELLO WORLD
Lowercase: hello world
7
7
true
false
                 Hello World, Riddhima                       
Hello World, Riddhima
HelloWorld
HelloWorld
*/
