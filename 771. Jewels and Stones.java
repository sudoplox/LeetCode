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
