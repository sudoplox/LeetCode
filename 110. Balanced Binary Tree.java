110. Balanced Binary Tree
https://leetcode.com/problems/balanced-binary-tree/

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
    public boolean isBalanced(TreeNode root) {
        return (help(root)!=-1);
    }
    public static int help(TreeNode root){
        if(root==null)return 1;
        
        int left=help(root.left);
        
        if(left==-1){
            return -1;
        }
        int right=help(root.right);
        if(right==-1){
            return -1;
        }
        if(Math.abs(left-right)>1){
            return -1;
        }
        return(Math.max(left,right)+1);

    }
}

Runtime: 1 ms, faster than 94.02% of Java online submissions for Balanced Binary Tree.
Memory Usage: 39.9 MB, less than 66.76% of Java online submissions for Balanced Binary Tree.