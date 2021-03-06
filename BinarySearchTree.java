package com.ds.binarytree;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(0);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(6);

		BinarySearchTree binarySearchTree = new BinarySearchTree();
		TreeNode  treeNode = binarySearchTree.searchBST(root, 5);

	}

	 public TreeNode searchBST(TreeNode root, int val) 
	 {
		 if (root == null) {
			return root;
		 }
		 System.out.print(root.val + " ");
		 if(root.val==val) {
			 return root;
		 } 
		 
		 if(root.val > val)
		 {
			 root=root.left;
		 }
		 else
		 {
			 root=root.right;
		 }
		 return searchBST(root, val);
	 }
}
