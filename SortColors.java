package com.ds.binarytree;

import java.util.Arrays;

public class SortColors 
{
	public static void main(String[] args) 
	{
		SortColors sortColors = new SortColors();
		sortColors.sortColors(new int[]{2,0,2,1,1,0,5});
	}
	
	 private void sortColors(int[] nums) 
	 {
		 for(int i=0; i<nums.length; i++) 
		 {
			 for(int j=0; j<nums.length; j++) 
			 {
				 if(nums[j]>nums[i])
				 {
					 int t = nums[i];
					 nums[i] = nums[j];
					 nums[j] = t; 
				 }
			 }
		 }
		 
		 System.out.println(Arrays.toString(nums));
	 }
}
