/*
101. Symmetric Tree
https://leetcode.com/problems/symmetric-tree/
*/

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
    static int left=0;
    static int right=0;
    ArrayList<Integer> ar=new ArrayList<>();
    public boolean isSymmetric(TreeNode root) { 
        return func(root,root);
    }
    boolean func(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null)return true;
        if(t1==null || t2==null)return false;
        return(t1.val ==t2.val)
            && func(t1.right,t2.left)
            && func(t1.left,t2.right);
        
    }
}