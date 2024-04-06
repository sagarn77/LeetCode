package LeetCode.Array;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        // System.out.println(plusOne(arr));
        for (int i : plusOne(arr)) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }else {
            for(int i=digits.length - 1; i >= 0; i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                    if(i == 0){
                        int[] arr = new int[digits.length + 1];
                        arr[0] = 1;
                        return arr;
                    }else if(digits[i - 1] != 9){
                        digits[i - 1] = digits[i - 1] + 1;
                        break;
                    }
                }
            }
            return digits;
        }
    }
}






    // Array -> 66. Plus One
	// You are given a large integer represented as an integer array digits, where each digits[i] 
    // is the ith digit of the integer. The digits are ordered from most significant to least 
    // significant in left-to-right order. The large integer does not contain any leading 0's.
	// Implementation = So to implement this, I checked if the last element is 9 or not, if it's 9 
    // then I returned the array by adding 1 to the last element, else I iterated on the array and 
    // checked if the number is 9 , if it is then I made it 0 and added 1 to it's preceding element and 
    // returned the array. Also, I checked if it's the first element , if it is then I created a new array and 
    // added 1 as it's first element and returned the array.
