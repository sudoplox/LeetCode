292. Nim Game
https://leetcode.com/problems/nim-game/


class Solution {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
}
Runtime: 0 ms, faster than 100.00% of Java online submissions for Nim Game.
Memory Usage: 32.8 MB, less than 5.33% of Java online submissions for Nim Game.

...

Idea
Nim has maximum of 3 choices at every i. He will chose the path that gives a win for him. There will be lot of overlapping subproblems, so we memoize it.

dp[i] stores the result of the game (win or lose) when there are i stones left for the player whoever asks for it.
So if we build from the bottom, we can always check the last 3 positions to see if we can turn current number into any number from the last 3 positions that gurantees a win for us.

Solution 1 (MLE)

public boolean canWinNim(int n) {
        boolean[] dp = new boolean[Math.max(n+1,4)];
        dp[1] = true;
        dp[2] = true;
        dp[3] = true;
        for(int i=4; i <= n; i++)
            dp[i] = !dp[i-1] || !dp[i-2] || !dp[i-3];
        return dp[n];
    }
Solution 2 (TLE)

public boolean canWinNim(int n) {
        if(n <= 3) return true;
        boolean[] dp = new boolean[4];
        dp[0] = true;
        dp[1] = true;
        dp[2] = true;
        for(int i=4; i <= n; i++){
            dp[3] = !dp[2] || !dp[1] || !dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = dp[3];
        }
        return dp[3];
    }
Solution3 (MLE) DP top-down version

class Solution {
    Boolean[] dp = null;
    public boolean canWinNim(int n) {
        dp = new Boolean[n+1];
        dp[0] = false;
        dp[1] = true;
        return helper(n);        
    }
    private boolean helper(int n){
        if(dp[n] == null)
            dp[n] = !helper(n-1) || !helper(n-2) || !helper(n-3); 
         return dp[n];
    }
}