1313. Decompress Run-Length Encoded List
https://leetcode.com/problems/decompress-run-length-encoded-list/


class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        arr=[]
        for i in range(0,len(nums),2):
            freq=nums[i]
            val=nums[i+1]
            arr=arr+list([val]*freq)
        return arr

Runtime: 68 ms, faster than 69.65% of Python3 online submissions for Decompress Run-Length Encoded List.
Memory Usage: 12.9 MB, less than 100.00% of Python3 online submissions for Decompress Run-Length Encoded List.