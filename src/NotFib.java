/*
Name: Sophia Brix
Date: Jan 25, 2024
Description: This program calculates the sequence of n terms
in the Not Fibonacci Sequence. This is Problem #3 in Assignment 1.
Input: Number of terms the user would like to see in the Not Fib Sequence.
Output: The sequence of numbers.

*/
public class NotFib {

    //Main method
    public static void main(String[] args){

        int n = 9; //numbers in the not fibonacci sequence

        System.out.println("The first " + n + " numbers in the Not Fibonacci Sequence is: ");

        //creates an array size n +1 to store not fib variables
        int[] arr = new int[n+1];

        arr[0] = 0; //first value
        arr[1] = 1; //second value

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        for(int i = 2; i <= n; i++){

            //multiplies the 1st previous term by 2 & 2nd previous by 3
            arr[i] = 2*(arr[i-1]) + 3*(arr[i-2]);

            System.out.println(arr[i]);
        }

        System.out.println("");
        System.out.println(":) Yay!");
    }
}