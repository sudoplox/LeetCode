1295. Find Numbers with Even Number of Digits
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        count=0
        for i in nums:
            if len(str(i))%2==0:
                count+=1    
        return(count)
        
Runtime: 40 ms, faster than 99.63% of Python3 online submissions for Find Numbers with Even Number of Digits.
Memory Usage: 12.8 MB, less than 100.00% of Python3 online submissions for Find Numbers with Even Number of Digits.