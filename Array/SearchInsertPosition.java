package LeetCode.Array;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 5));
    }

    public static int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }else if(i == nums.length - 1){
                return i+1;
            }
        }
        return -1;
    }
}






    // Array -> 35. Search Insert Position
	// Given a sorted array of distinct integers and a target value, return the index 
    // if the target is found. If not, return the index where it would be if it were inserted in order.
	// Implementation = So to implement this we will iterate the array and check if the element 
    // is equal to target or not, if it's equal then return the index and if the index reches to the 
    // last element and still not equal then return index plus 1.
