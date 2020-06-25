package com.ds.binarytree;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		System.out.println(duplicateNumber.findDuplicate(new int[] { 3, 1, 3, 4, 2 }));
	}

	private int findDuplicate(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		List<Integer> list = new ArrayList<Integer>();
		for (int n : nums) {
			if (!list.contains(n)) {
				list.add(n);
			} else {
				return n;
			}
		}
		return 0;
	}

}
