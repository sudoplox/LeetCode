887. Super Egg Drop
https://leetcode.com/problems/super-egg-drop/

class Solution {
    public int superEggDrop(int K, int N) {
        int lo = 1, hi = N;
        while (lo < hi) {
            int mi = (lo + hi) / 2;
            if (f(mi, K, N) < N)
                lo = mi + 1;
            else
                hi = mi;
        }

        return lo;
    }

    public int f(int x, int K, int N) {
        int ans = 0, r = 1;
        for (int i = 1; i <= K; ++i) {
            r *= x-i+1;
            r /= i;
            ans += r;
            if (ans >= N) break;
        }
        return ans;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Super Egg Drop.
Memory Usage: 33 MB, less than 78.77% of Java online submissions for Super Egg Drop.