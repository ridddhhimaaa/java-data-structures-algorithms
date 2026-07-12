class Three{
    public static void main(String[] args){
        //Code Using For Loop 
        // for(int i = 2; i<=100 ; i+=2){
        //     System.out.println(i);
        // }
        
        //Code Using While Loop
        int i = 2;
        while(i<=100){
            System.out.println(i);
            i+=2;
        }
    }
}
    /*
    ==================================================
    Problem:
    Print even numbers from 2 to 100.

    Difficulty:
    Easy

    Topic:
    Numbers

    Approach:
    Step 1: Start with 2.
    Step 2: Keep printing while the number is less than or equal to 100.
    Step 3: Increase the number by 2 each time.

    Algorithm:
    Use a while loop to print only even numbers in the range from 2 to 100.

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
                // Print the current even number
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
    ...
    100
    */