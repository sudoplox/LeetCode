771. Jewels and Stones
https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }
}
Runtime: 6 ms, faster than 6.43% of Java online submissions for Jewels and Stones.
Memory Usage: 36.3 MB, less than 76.98% of Java online submissions for Jewels and Stones.

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        for (char c : S.toCharArray()) {
            if (J.indexOf(c) != -1) {
                count += 1;
            }
        }
        return count;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Jewels and Stones.
Memory Usage: 34.5 MB, less than 99.86% of Java online submissions for Jewels and Stones.

//epic
For the binary representation from right to left(until we find the leftmost 1):
if we meet 0, result += 1 because we are doing divide;
if we meet 1, result += 2 because we first do "-1" then do a divide;
ony exception is the leftmost 1, we just do a "-1" and it becomse 0 already.

int numberOfSteps (int num) {
        if(!num) return 0;
        int res = 0;
        while(num) {
            res += (num & 1) ? 2 : 1;
            num >>= 1;
        }
        return res - 1;
    }