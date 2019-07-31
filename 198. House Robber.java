198. House Robber
https://leetcode.com/problems/house-robber/
https://leetcode.com/problems/house-robber/discuss/156523/From-good-to-great.-How-to-approach-most-of-DP-problems.

class Solution {
    static int max;
    public int rob(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        int size=nums.length;
        if(size==1){
            return nums[0];
        }
        else if(size==2){
            return (Math.max(nums[0],nums[1]));
        }
        int[] dp=new int[size];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<size;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        Arrays.sort(dp);
        return (dp[dp.length-1]);
    }
   
}
