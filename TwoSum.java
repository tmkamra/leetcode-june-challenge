package com.ds.leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		System.out.println(Arrays.toString(twoSum.twoSum(new int[] {2, 7, 11, 15}, 9)));
	}

	private int[] twoSum(int[] nums, int target) {
        
    	int[] indices = new int[2];
    	for(int i=0; i<nums.length; i++)
    	{
    		for(int j=0; j<nums.length; j++)
    		{
    			if(i!=j && (nums[i]+nums[j])==target)
    			{
    				indices[0] = j;
    				indices[1] = i;
    			}
    		}
    	}
    	return indices;
    }
	
	/*
	 * public int[] twoSum(int[] nums, int target) { int[] result = new int[2];
	 * HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); for (int i =
	 * 0; i < nums.length; i++) { if (map.containsKey(target - nums[i])) { result[1]
	 * = i; result[0] = map.get(target - nums[i]); return result; } map.put(nums[i],
	 * i); } return result; }
	 */
}
