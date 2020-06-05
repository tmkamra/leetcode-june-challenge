package com.ds.binarytree;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		char[] charArray = {'h','e','h','0'};
		rs.reverseString(charArray);

	}
	
    public void reverseString(char[] s) {
    	
    	for (int i=0; i<s.length/2; i++)
    	{
    		char temp = s[i];
    		s[i] = s[(s.length-1)-i];
    		s[(s.length-1)-i] = temp;
    	}
    	System.out.println(s);
    }

}
