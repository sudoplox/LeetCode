1038. Binary Search Tree to Greater Sum Tree
https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstToGst(TreeNode root) {
	if (root == null) return null;
	helper(root, 0);
	return root;
}

public int helper(TreeNode root, int total) {
	if (root == null) {
		return 0;
	}

	// calc total of right sub tree
	int totalRight = helper(root.right, total);
	// if right node is null then add total to current node value. Case: node 5, node 0...
	// else add totalRight
	root.val += (totalRight == 0 ? total : totalRight);
	int totalLeft = helper(root.left, root.val);
	// if left node is null return current node value
	// else return total left
	totalLeft = totalLeft == 0 ? root.val : totalLeft;

	return totalLeft;
}
}