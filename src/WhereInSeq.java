import java.util.Arrays;

/*
Name: Sophia Brix
Date: Jan 25, 2024
Description: This program locates a number in a sequence of n terms.
in the Not Fibonacci Sequence. This is Problem #4 in Assignment 1.
Input: Number of terms the user would like to see in the Not Fib Sequence & number to find in the sequence.
Output: The sequence of numbers and the location of the number or the closest number.
*/
public class WhereInSeq {

    //Main method
    public static void main(String[] args) {

        int n = 9; //number of values to return from the sequence

        System.out.println("The first " + n + " numbers in the Not Fibonacci Sequence is: ");

        //creates an array size n +1 to store not fib variables
        int[] arr = new int[n + 1];

        arr[0] = 0; //first value
        arr[1] = 1; //second value

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for (int i = 2; i <= n; i++) {

            //multiplies the 1st previous term by 2 & 2nd previous by 3
            arr[i] = 2 * (arr[i - 1]) + 3 * (arr[i - 2]);

            System.out.println(arr[i]);
        }

        int w = 9; //number to look for in the generated sequence
        System.out.println("Number to find in the Not Fib Sequence: " + w );

        /*
        Loops through the not fib sequence to see if input matches a value.
         */
        for (int i = 0; i < arr.length; i++) {

            if (w == arr[i]) { //checks if input matches a value
                    System.out.println("The number " + w + " is in the NotFib Sequence!" +
                            "\nIt has a position of " + Arrays.binarySearch(arr, arr[i]) +" in the sequence.");
            }

            if (w != arr[i]) {

                if( w < arr[i] && w > arr[i-1]){

                        System.out.println("The number " + w + " is not in the sequence." +
                                "\nTherefore, the closest lower number is " + arr[i-1]
                                + " which has a position of " + Arrays.binarySearch(arr, arr[i]) + " in the sequence.");
                }
            }
        }
    }
}



