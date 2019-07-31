169. Majority Element
https://leetcode.com/problems/majority-element/

https://leetcode.com/problems/majority-element/discuss/51612/C%2B%2B-6-Solutions

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length/2]);
    }
}