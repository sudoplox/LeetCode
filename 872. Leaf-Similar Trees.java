872. Leaf-Similar Trees
https://leetcode.com/problems/leaf-similar-trees/


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
    static ArrayList<Integer> list1;
    static ArrayList<Integer> list2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list1=new ArrayList<>();
        list2=new ArrayList<>();
        if(root1==null || root2==null)return true;
        help1(root1);
        help2(root2);
        if(list1.size()!=list2.size())return false;
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i)+" "+list2.get(i));
            if(list1.get(i)!=list2.get(i)){
                return false;
            }
        }
        return true;
    }
    public static void help1(TreeNode root){
        if(root.left==null && root.right==null){
            list1.add(root.val);
            return;
        }
        if(root.left==null && root.right!=null){
            help1(root.right);
        }
        if(root.left!=null && root.right==null){
            help1(root.left);
        }
        if(root.left!=null && root.right!=null){
             help1(root.right);
             help1(root.left);
        }
    }
    public static void help2(TreeNode root){
        if(root.left==null && root.right==null){
            list2.add(root.val);
            return;
        }
        if(root.left==null && root.right!=null){
            help2(root.right);
        }
        if(root.left!=null && root.right==null){
            help2(root.left);
        }
        if(root.left!=null && root.right!=null){
             help2(root.right);
             help2(root.left);
        }
    }
}
Runtime: 5 ms, faster than 5.94% of Java online submissions for Leaf-Similar Trees.
Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Leaf-Similar Trees.

Elegant Solution:


class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // sanity check
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        getLeaf(root1, leaves1);        
        getLeaf(root2, leaves2);
        
        int index = 0;
        if( leaves1.size() != leaves2.size() ) return false;
        
        while (index < leaves1.size() && index < leaves2.size()) {
            if (leaves1.get(index) != leaves2.get(index)) {
                return false;
            }
            index++;
        }
        return true;
        
    }
    
    public void getLeaf(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        
        
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }       
        getLeaf(root.left, list); 
        getLeaf(root.right, list);
        
    }
}