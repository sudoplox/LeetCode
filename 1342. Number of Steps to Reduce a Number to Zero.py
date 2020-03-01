1342. Number of Steps to Reduce a Number to Zero
https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution:
    def numberOfSteps (self, num: int) -> int:
        if num==0: 
            return 0
        count=0
        while num != 0:
            if num%2==0:
                num=num/2
                count+=1
            else:
                num-=1
                count+=1
        return count
Runtime: 20 ms, faster than 96.31% of Python3 online submissions for Number of Steps to Reduce a Number to Zero.
Memory Usage: 12.7 MB, less than 100.00% of Python3 online submissions for Number of Steps to Reduce a Number to Zero.
