852. Peak Index in a Mountain Array
https://leetcode.com/problems/peak-index-in-a-mountain-array/

class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        if(nums==null || nums.length==0)return 0;
        
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

Golden search?
Approach 4, Golden-section search
It is guaranted only one peak, we can apply golden-section search

    def peakIndexInMountainArray(self, A):
        def gold1(l, r):
            return l + int(round((r - l) * 0.382))

        def gold2(l, r):
            return l + int(round((r - l) * 0.618))
        l, r = 0, len(A) - 1
        x1, x2 = gold1(l, r), gold2(l, r)
        while x1 < x2:
            if A[x1] < A[x2]:
                l = x1
                x1 = x2
                x2 = gold1(x1, r)
            else:
                r = x2
                x2 = x1
                x1 = gold2(l, x2)
        return A.index(max(A[l:r + 1]), l)