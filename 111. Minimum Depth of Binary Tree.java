111. Minimum Depth of Binary Tree
https://leetcode.com/problems/minimum-depth-of-binary-tree/

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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if (root.left == null)	return minDepth(root.right) + 1;
	    if (root.right == null) return minDepth(root.left) + 1;
        return(1+Math.min(minDepth(root.left),minDepth(root.right)));
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
Memory Usage: 38.3 MB, less than 99.16% of Java online submissions for Minimum Depth of Binary Tree.