package LeetCode.Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}





    // Array -> 27. Remove Element
	// Two inputs are given, one is array and other is value
	// we have to remove all the elements in array those are equal to value and return the 
    // number of elements which are not equal to value
	// Implementation = So to implement this we will iterate the array and check 
    // if the elements value is equal to the value, if it's not equal then we will add that value 
    // to arr with another pointer and increment that pointer and return the value of that pointer.
