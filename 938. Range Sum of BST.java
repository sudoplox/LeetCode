938. Range Sum of BST
https://leetcode.com/problems/range-sum-of-bst/

Naive Solution:
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
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null) return 0;
        List<Integer> list = new ArrayList<>();
        
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null || !stack.isEmpty()){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        }
        int ans=0;
        int ind=list.indexOf(L);
        for(int i=ind;i<=list.indexOf(R);i++){
            ans+=list.get(i);
        }
        return ans;
    }
}
Runtime: 257 ms, faster than 5.03% of Java online submissions for Range Sum of BST.
Memory Usage: 48.6 MB, less than 62.98% of Java online submissions for Range Sum of BST.


dfs:
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
      public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) { return 0; }
        int sum = 0;
        if (root.val > L) { sum += rangeSumBST(root.left, L, R); } // left child is a possible candidate.
        if (root.val < R) { sum += rangeSumBST(root.right, L, R); } // right child is a possible candidate.
        if (root.val >= L && root.val <= R) { sum += root.val; } // count root in.
        return sum;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
Memory Usage: 44.8 MB, less than 98.64% of Java online submissions for Range Sum of BST.