package com.company;
package java.HashMap;

public class two_sum {

}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        if (nums == null || nums.length < 2){
            return null;
        }
        int[] res = new int[]{-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return res;
    }
}