199. Binary Tree Right Side View
https://leetcode.com/problems/binary-tree-right-side-view/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
My solution:
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> Result=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(root==null){
            return result;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sublist=new LinkedList<Integer>();
            int x=0;
            for(int i=0;i<size;i++){
                TreeNode temp=queue.remove();
                sublist.add(temp.val);
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
                if(temp.left!=null){
                    queue.offer(temp.left);
                }   
            }
            Result.add(sublist);
        }
        for(int i=0;i<Result.size();i++){
            result.add(Result.get(i).get(0));
        }
        return result;
    }
}

Discussion solution:
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
        
    }
}