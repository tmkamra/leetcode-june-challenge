package com.ds.binarytree;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber singleNumber = new SingleNumber();
		System.out.println(singleNumber.singleNumber(new int[] { 0, 1, 0, 1, 0, 1, 99 }));

	}

	private int singleNumber(int[] nums) {
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			} else {
				hm.put(nums[i], 1);

			}
		}
		for (@SuppressWarnings("rawtypes")
		Map.Entry entry : hm.entrySet()) {
			if (1 == (int) entry.getValue()) {
				return (int) entry.getKey();
			}
		}
		return 0;
	}
}
