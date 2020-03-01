1281. Subtract the Product and Sum of Digits of an Integer
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        term1=1
        term2=0
        while n!=0:
            dig=n%10
            term1=term1*dig
            term2=term2+dig
            n=n//10
        return term1-term2

Runtime: 28 ms, faster than 60.63% of Python3 online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 12.7 MB, less than 100.00% of Python3 online submissions for Subtract the Product and Sum of Digits of an Integer.

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        str1 = str(n)
        prod = 1
        sumof = 0
        for i in str1:
            prod *= int(i)
            sumof += int(i)
        return prod - sumof