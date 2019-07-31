102. Binary Tree Level Order Traversal
https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> Result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null){
            return Result;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sublist=new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode temp=queue.remove();
                sublist.add(temp.val);
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            Result.add(sublist);
        }
        return Result;
    }
}
