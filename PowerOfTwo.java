package com.ds.binarytree;

public class PowerOfTwo {

	public static void main(String[] args) 
	{
		PowerOfTwo powerOfTwo = new PowerOfTwo();
		System.out.println(powerOfTwo.isPowerOfTwo(536870912));

	}

	private boolean isPowerOfTwo(int n) 
	{
		long i = 1;
		while(i < n) 
		{
			i*=2;
		}
		return i == n;
	
	}
}
