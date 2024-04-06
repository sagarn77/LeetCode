package LeetCode.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        twosum(arr, 9);
    }

    private static void twosum(int[] arr, int i) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            int x = i - arr[j];
            if(map.containsKey(x)){
                System.out.println(map.get(x) + " " + j);
            }
            map.put(arr[j], j);
        }
    }
}






    // Array -> 1. Two Sum
	// So there were two inputs one is array and other is target
	// we have to check if any elements sum add up to target or not and return there indices
	// e.g. Input-> arr = {2,7,11,13}, target = 9 | Output = {0,1}
	// Implementation = So to implement this we used a hashmap, we put the element as key and indice as value for that key.
	// Then for new element, we subtract it with the target and check the difference if it's present in the keys of hasmap. If it's present in the hashmap, we simply return indices.
	// using map.get and index of the for loop.
