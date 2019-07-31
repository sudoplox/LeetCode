257. Binary Tree Paths
https://leetcode.com/problems/binary-tree-paths/

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
    public static List<String> ad;
    public List<String> binaryTreePaths(TreeNode root) {
        ad=new ArrayList<>();
        if(root==null )return ad;
        help(root,"");
        return ad;
    }
    public static void help(TreeNode root,String s){
        if(root.left==null && root.right==null){
            s+="->"+root.val;
            ad.add(s.substring(2));
        }
        if(root.left!=null && root.right!=null){
            help(root.left,s+"->"+root.val);
            help(root.right,s+"->"+root.val);
        }
        else if(root.left!=null && root.right==null){
            help(root.left,s+"->"+root.val);
        }
        else if(root.left==null && root.right!=null){
            help(root.right,s+"->"+root.val);
        }      
    }
}
Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Binary Tree Paths.


Elegant Solution:

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null) searchBT(root, "", answer);
        return answer;
    }
    private void searchBT(TreeNode root, String path, List<String> answer) {
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) searchBT(root.left, path + root.val + "->", answer);
        if (root.right != null) searchBT(root.right, path + root.val + "->", answer);
    }
}
Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Binary Tree Paths.
