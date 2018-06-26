package com.array.common;/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution2Sum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!resultMap.containsKey(nums[i])) {
                resultMap.put(nums[i], i);
            }

            if (resultMap.containsKey(target - nums[i])) {
                result[0] = resultMap.get(target - nums[i]);
                result[1] = i;
                break;
            }
        }

        return result;
    }
}