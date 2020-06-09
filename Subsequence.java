package com.ds.binarytree;

public class Subsequence {

	public static void main(String[] args) {
		
		Subsequence subsequence = new Subsequence();
		System.out.println(subsequence.isSubsequence("dd", "jhjbjdks"));
		System.out.println(subsequence.isSubsequence("leetcode", "leeetcode"));
	}
	
	private boolean isSubsequence(String s, String t) {
		int j = 0; 
        for (int i = 0; i < t.length() && j < s.length(); i++) 
            if (s.charAt(j) == t.charAt(i)) 
                j++; 
        return (j == s.length()); 
    }
}
