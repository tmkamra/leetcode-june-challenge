package com.ds.binarytree;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		ShuffleArray shuffleArray = new ShuffleArray();
		int[] arr = new int[]{1,2,3,4,4,3,2,1};
		int[] shuffledArray = shuffleArray.shuffle(arr, 4);
		System.out.println(Arrays.toString(shuffledArray));
	}

	public int[] shuffle(int[] nums, int n) {
        int[] shuffledNums= new int[nums.length];
        int[] array1 = Arrays.copyOfRange(nums, 0, n);
        int[] array2 = Arrays.copyOfRange(nums, n, nums.length);
        
        for (int i=0,j=0,k=0; i<nums.length; i++) 
        {
        	if(i%2 == 0) 
        	{
        		shuffledNums[i] = array1[j];
        		j++;
        	} else {
        		shuffledNums[i] = array2[k];
        		k++;
        	}
        }
        return shuffledNums;
    }
}
