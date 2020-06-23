package com.ds.binarytree;

public class CountCompleteTreeNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		CountCompleteTreeNodes completeTreeNodes = new CountCompleteTreeNodes();
		System.out.println(completeTreeNodes.countNodes(root));
	}

	private int countNodes(TreeNode root) {
		if(root==null)
			return 0;
		
        return countNodes(root.left)+countNodes(root.right)+1;
    }
}
