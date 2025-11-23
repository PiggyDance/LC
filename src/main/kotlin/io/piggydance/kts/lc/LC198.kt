package io.piggydance.kts.lc

import kotlin.math.max

class LC198 {
    fun rob(nums: IntArray): Int {
        // 2,7,9,3,1
        // dp[i] = max(dp[i-2] + nums[i], dp[i-1])
        val dp = IntArray(nums.size + 1)
        dp[0] = 0
        dp[1] = nums[0]
        for (i in 2..nums.size) {
            dp[i] = max(dp[i-2] + nums[i-1], dp[i-1])
        }
        return dp[nums.size]
    }
}