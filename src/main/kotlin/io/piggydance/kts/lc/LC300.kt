package io.piggydance.kts.lc

import kotlin.math.max

class LC300 {
    fun lengthOfLIS(nums: IntArray): Int {
        // nums[i] > nums[j]
        // dp[i] = max(dp[i], dp[j] + 1)
        val dp = IntArray(nums.size + 1)
        dp[0] = 1
        var maxans = 1
        for (i in 1..< nums.size) {
            dp[i] = 1
            for (j in 0..< i) {
                if (nums[i] > nums[j]) {
                    dp[i] = max(dp[i], dp[j] + 1)
                }
            }
            maxans = max(maxans, dp[i])
        }
        return maxans
    }
}