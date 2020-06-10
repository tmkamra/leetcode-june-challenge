package com.ds.binarytree;

public class SearchInsertPosition {

	public static void main(String[] args) 
	{
		SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
		System.out.println(searchInsertPosition.searchInsert(new int[]{1,3,4,5,9},8 ));
	}

	private int searchInsert(int[] nums, int target) 
	{
		int l=0;
		int h=nums.length-1;
		int m=nums.length/2;
		
		while(l<=h)
		{
			if(nums[m]==target)
				return m;
			if(target<nums[m])
			{
				h=m-1;
				m=m/2;
			}
			else
			{
				l=m+1;
				m= (l+h)/2;
			}
		}
		return l;   
    }
}
