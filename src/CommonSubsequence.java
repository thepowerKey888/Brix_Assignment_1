import java.util.Arrays;

/*
Name: Sophia Brix
Date: Jan 25, 2024
Description: This program determines the longest common subsequence. This is Problem #1 to Assignment 1.
Input: 2 strings
Output: length of subsequence & the subsequence itself
 */

public class CommonSubsequence {

    /*
    Method to determine the difference between x & y (the two arrays).
    @param x An int value.
    @param y An int value
    @return z An int value that holds the difference between the values of x & y.
     */
    public static int difference(int x, int y){

        int z = x - y;
        return z;

    }

    /*
    Main Method
     */
    public static void main(String[] args){

        String text1 = "almanacs";
        String text2 = "albatross";

        char[] array1 = text1.toCharArray(); //turns text1 string into char array
        char[] array2 = text2.toCharArray(); //turns text2 string into char array

        //calls the difference method and stores in a variable called diff
        int diff = difference(array1.length, array2.length);

        /*
        If statement that determines if the first array is longer than the other.
        If so, then it subtracts the length of the first array and updates the size.
         */
        if(diff > 0){

            //Updating size.
            array1 = Arrays.copyOf(array1, array1.length - diff);
            //overwriting the array
        }


        else{  //if there is no difference then keep the size.
            array1 = array1;
        }

        int x = 0;

        for(int i = 0; i < array1.length; i++){ //determines the size of the new array.
            x = x + 1;
        }

        char[] subsequence = new char[x]; //array to hold the subsequence

        int t = 0; //variable to determine the amount of non-empty values

        /*
        Determines if the elements in each array match.
        If so, it is added to the new array.
         */

        for(int i = 0; i < array1.length; i++){

            if(array1[i] == array2[i] ){

                t = 1 + t; //counts length of matching subsequence elements

                subsequence[i] = array1[i]; //add the matching elements to the new array
            }
        }

        System.out.println("");
        System.out.println("Input:\ntext1 = " + text1 + "\ntext2 = " + text2 );
        System.out.println("");
        System.out.println("Output: " + t);
        System.out.println("The longest common subsequence is: ");

        for( char c : subsequence){ //prints non-empty elements in the subsequence array

            if(c != 0 ){

                System.out.println(c);
            }
        }

        System.out.println("Its has a length of " + t);

    }
}