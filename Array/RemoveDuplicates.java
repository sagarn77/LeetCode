package LeetCode.Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(arr));
    }
    
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
        
}




    // Array -> 26. Remove Duplicates from Sorted Array
	// Input is given as array,
	// we have to return the count of unique number of elements and also update the array with unique 
    // elements from start of the array i.e removing the duplicates
	// Implementation = So to implement this we will iterate the array from 1st index element and 
    // compare it with it's previous value . if the value is not equal we have found a new element, 
    // so we can update the existng array with the new elementusing a second pointer which only increments
    // when we found a new element.

