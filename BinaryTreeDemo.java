package com.ds.binarytree;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
	}
}

public class BinaryTreeDemo {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		Solution sol = new Solution();
		TreeNode  treeNode = sol.invertTree(root);
		
		
		}
}

	class Solution {
		public TreeNode invertTree(TreeNode root) {

			if (root == null) {
				return null;
			}
			System.out.print(root.val + " ");

			invertTree(root.left);
 			invertTree(root.right);

			TreeNode temp = root.left;
			root.left = root.right;
			root.right = temp;

			return root;
		}
	}

// Definition for a binary tree node.
