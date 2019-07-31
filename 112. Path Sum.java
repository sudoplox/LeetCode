112. Path Sum
https://leetcode.com/problems/path-sum/

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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        return check(root,sum);
    }
    public boolean check(TreeNode root,int sum){
        if(root.left==null && root.right==null){
            if(sum-root.val==0){
                return true;
            }
            else{
                return false;
            }
        }
        
        if(root.left!=null && root.right!=null){
            return(check(root.left,sum-root.val) || check(root.right,sum-root.val));
        }
        else if(root.left==null && root.right!=null){
            return( check(root.right,sum-root.val));
        }
        else if(root.left!=null && root.right==null){
            return(check(root.left,sum-root.val) );
        }
        return false;
        
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
Memory Usage: 37.6 MB, less than 93.49% of Java online submissions for Path Sum.
