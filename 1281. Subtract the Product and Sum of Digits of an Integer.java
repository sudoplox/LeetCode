1281. Subtract the Product and Sum of Digits of an Integer
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        int dig=0;
        while(n!=0){
            dig=n%10;
            prod=prod*dig;
            sum=sum+dig;
            n=n/10;
        }
        return(prod-sum);
    }
}

Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.