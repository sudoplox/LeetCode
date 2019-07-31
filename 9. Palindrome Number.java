9. Palindrome Number
https://leetcode.com/problems/palindrome-number/


class Solution {
    public boolean isPalindrome(int x) {
    
        if (x < 0) return false;

        int p = x; 
        int q = 0; 

        while (p >= 10){
            q *=10; 
            q += p%10; 
            p /=10; 
        }

        return q == x / 10;
    }
}
Runtime: 6 ms, faster than 100.00% of Java online submissions for Palindrome Number.
Memory Usage: 36.5 MB, less than 5.07% of Java online submissions for Palindrome Number.