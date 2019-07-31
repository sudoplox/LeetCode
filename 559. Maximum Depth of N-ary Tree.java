/*

559. Maximum Depth of N-ary Tree
https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

*/ 

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    int max=0;
    public int maxDepth(Node root) {
        if(root==null)return 0;
        func(root,1);
        return max;
    }
    public void func(Node root,int depth){
        if(root==null)return;
        
        max=Math.max(depth,max);
        
        for(Node node:root.children){
            func(node,depth+1);
        }
    }   
}