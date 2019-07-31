/*
103. Binary Tree Zigzag Level Order Traversal
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> Result=new ArrayList<>();
        Deque<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null){
            return Result;
        }
        queue.addLast(root);
        int o=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            LinkedList<Integer> sublist=new LinkedList<Integer>();
            o=o*(-1);
            for(int i=0;i<size;i++){
                TreeNode temp=queue.remove();
                if(o!=1){
                    sublist.add(temp.val);
                }
                else{
                    sublist.addFirst(temp.val);
                }
                

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
