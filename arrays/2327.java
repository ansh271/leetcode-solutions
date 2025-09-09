class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int MOD = 1_000_000_007;
        long share = 0;
        // dp[i] = number of people who learn the secret on day i+1 (0-indexed)
        int[] dp = new int[n];
        dp[0] = 1;  // Day 1: one person knows the secret

        for (int i = 1; i < n; i++) {
            // People who can now start sharing (learned the secret delay days ago)
            if (i - delay >= 0) {
                share += dp[i - delay];
            }
            // People who just forgot the secret (forget days ago)
            if (i - forget >= 0) {
                share -= dp[i - forget];
            }
            // Keep it positive and within mod
            share = (share % MOD + MOD) % MOD;
            dp[i] = (int) share;
        }

        // Sum everyone who still remembers the secret on day n
        long result = 0;
        for (int i = n - forget; i < n; i++) {
            if (i >= 0) result = (result + dp[i]) % MOD;
        }
        return (int) result;
    }
}
