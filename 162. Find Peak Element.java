162. Find Peak Element
https://leetcode.com/problems/find-peak-element/


What we are essentially doing is going in the direction of the rising slope (by choosing the element which is greater than current). 
How does that guarantee the result? 
Think about it, there are 2 possibilities.
a) rising slope has to keep rising till end of the array 
b) rising slope will encounter a lesser element and go down.
In both scenarios we will have an answer. 
In 
a) the answer is the end element because we take the boundary as -INFINITY 
b) the answer is the largest element before the slope falls. 

class Solution {
    public int findPeakElement(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        if(nums.length==1)return 0;
        if(nums[0]>nums[1])return 0;
        if(nums[nums.length-1]>nums[nums.length-2])return nums.length-1;
        
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
Memory Usage: 38.2 MB, less than 98.85% of Java online submissions for Find Peak Element.