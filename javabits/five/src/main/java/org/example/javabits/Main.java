package org.example.javabits;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{9, 2, 15, 98, 34}, 23)));
        System.out.println(Arrays.toString(twoSum(new int[]{9, 2, 15, 98, 21, 34}, 23)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = target - nums[i];
            if(indexMap.containsKey(requiredNum)){
                return new int[]{indexMap.get(requiredNum), i};
            }
            indexMap.put(nums[i], i);
        }
        return null;
    }
}