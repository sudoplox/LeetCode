485. Max Consecutive Ones
https://leetcode.com/problems/max-consecutive-ones/


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        int ans=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ans+=1;
                max=Math.max(max,ans);
            }
           
            else{
                ans=0;
            }
        }
        return max;
    }
}
Runtime: 3 ms, faster than 42.21% of Java online submissions for Max Consecutive Ones.
Memory Usage: 39.2 MB, less than 98.63% of Java online submissions for Max Consecutive Ones.