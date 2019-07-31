145. Binary Tree Postorder Traversal
https://leetcode.com/problems/binary-tree-postorder-traversal/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

Recursive Solution:

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        preorder(root,list);
        return list;
    }
    public void preorder(TreeNode root,List<Integer> list){
        if(root==null)return ;
        preorder(root.left,list);
        preorder(root.right,list);
        list.add(root.val);
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
Memory Usage: 35 MB, less than 100.00% of Java online submissions for Binary Tree Postorder Traversal.

Iterative Solution:
