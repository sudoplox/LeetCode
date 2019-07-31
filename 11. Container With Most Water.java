11. Container With Most Water
https://leetcode.com/problems/container-with-most-water/


Naive Brute force:
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)return 0;
        if(height.length==2)return(Math.min(height[0],height[1]));
        
        int max=-1;
        for(int i=0;i<height.length-1;i++){
            for(int j=1;j<height.length;j++){
                int temp= Math.min(height[i],height[j]) * (j-i);
                if(   (temp ) > max  ){
                    max=temp;
                }
            }
        }
        return max;
    }
}
Runtime: 392 ms, faster than 5.05% of Java online submissions for Container With Most Water.
Memory Usage: 40 MB, less than 92.79% of Java online submissions for Container With Most Water.

2 Pointer Solution:
class Solution {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)return 0;
        if(height.length==2)return(Math.min(height[0],height[1]));
        
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                max=Math.max(max,height[left]*(right-left));
                left++;
            }
            else{
                max=Math.max(max,height[right]*(right-left));
                right--;
            }
        }
        return max;
    }
}
Runtime: 1 ms, faster than 100.00% of Java online submissions for Container With Most Water.
Memory Usage: 39.6 MB, less than 95.40% of Java online submissions for Container With Most Water.