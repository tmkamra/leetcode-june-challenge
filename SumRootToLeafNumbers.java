package com.ds.leetcode;

public class SumRootToLeafNumbers {

	int total=0;
	
	public static void main(String[] args) {
		SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		System.out.println(sumRootToLeafNumbers.sumNumbers(root));
	}

	public int sumNumbers(TreeNode root) {
		
		sumHelper(root, 0);
        return total;
    }

	private void sumHelper(TreeNode root, int sum) {
		if(root==null)
			return;
		sum=sum * 10 + root.val;
		if(root.left ==null && root.right== null)
		{
			total =  total + sum;
			return;
		}
		
		sumHelper(root.left, sum);
		sumHelper(root.right, sum);
	}
}
