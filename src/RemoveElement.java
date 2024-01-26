/*
Name: Sophia Brix
Date: Jan 25, 2024
Description: This program removes all occurrences of a number in an array
and returns the number of elements which are not equal to the given number.
This is problem #5 in Assignment 1.
Input: Array and number to remove.
Output: The number of elements in the array which is not equal to the given number.
*/
public class RemoveElement {

    /*
    Method that takes 3 inputs to check and see if an element exists in the array.
    If it does the element is removed and the first k elements that are not equal
    are moved to the beginning of the array.
     */
    public static int removeElement(int[] nums, int val, int nums_length ) {

        int  k = 0; //k pointer at index 0

        for(int i = 0; i < nums_length; i++){

            if(nums[i] != val){
                nums[k] = nums[i]; //put nums of i at position k
                k += 1; //increment k by 1
            }
        }
        return k;
    }

    //Main method
    public static void main(String[] args){

        int val = 3; //value to find

        int[] nums = new int[] {3,2,1,2,3}; //array to search through

        int nums_length = nums.length; //length of the array

        System.out.println(removeElement(nums, val, nums_length));
    }
}
