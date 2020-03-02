1323. Maximum 69 Number
https://leetcode.com/problems/maximum-69-number/submissions/

class Solution:
    def maximum69Number (self, num: int) -> int:
        inp=str(num)
        virgin=True
        arr=list()
        for i in inp:
            if i=='6' and virgin:
                arr.append(9)
                virgin=False
            else:
                arr.append(i)
                
        num=0
        for i in arr: 
            num*=10
            num+=int(i)
        return num
Runtime: 24 ms, faster than 86.02% of Python3 online submissions for Maximum 69 Number.
Memory Usage: 12.9 MB, less than 100.00% of Python3 online submissions for Maximum 69 Number.