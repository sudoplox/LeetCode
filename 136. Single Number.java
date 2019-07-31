136. Single Number
https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}

Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.
Memory Usage: 39 MB, less than 98.41% of Java online submissions for Single Number.