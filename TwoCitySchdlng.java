package com.ds.binarytree;

public class TwoCitySchdlng {

	 private int twoCitySchedCost(int[][] costs) {
		 java.util.Arrays.sort(costs, new java.util.Comparator<int[]>() {
				
				public int compare(int[] a, int[] b) {
			        return Integer.compare(a[0]-a[1], b[0]-b[1]);
				}
			});
	     
		 int sum =0;
		 for(int i=0; i< costs.length/2; i++) {
			 sum = sum + costs [i][0];
		 }
		 for (int i=costs.length/2; i<costs.length;i++) {
			 sum = sum + costs[i][1];
		 }
		 return sum;
	 }
	 
	 
	 public static void main(String[] args) {
 		int [][] costs = { {259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
 		TwoCitySchdlng solution = new TwoCitySchdlng();
 		int total = solution.twoCitySchedCost(costs);
 		System.out.println(total);
 	}

}
