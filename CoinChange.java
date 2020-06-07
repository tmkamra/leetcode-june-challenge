package com.ds.binarytree;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoinChange coinChange = new CoinChange();
		int total = coinChange.change(10, new int[]{4});
		System.out.println(total);

	}

	 private int change(int amount, int[] coins) {
	        int[][] a = new int[coins.length][amount+1]; 
	        if(coins.length == 0 && amount == 0) 
	        {
	            return 1;
	        } else if(coins.length == 0) {
	            return 0;
	        }
	        
	        for ( int i=1; i<coins.length; i++)
	        {
                a[i][0]=1;
	            for(int j=0; j<=amount; j++)
	            {
	            	a[0][j] = (j % coins[0] == 0) ? 1 : 0 ;
	                if(j>0) {
		                if(coins[i] > j) {
		                    a[i][j] = a[i-1][j];
		                }
		                else{
		                    a[i][j] = a[i-1][j] + a[i][j-coins[i]];
		                }
	                }
	            }
	        }
	        return a[coins.length-1][amount];
	    }
}
