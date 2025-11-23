package io.piggydance.kts.lc

class LC300 {
    fun lengthOfLIS(nums: IntArray): Int {
        // nums[i] > nums[j]
        // dp[i] = max(dp[i], dp[j] + 1)
        val dp = IntArray(nums.size)
        dp[0] = 1
//        for (i in 1..< nums.size) {
//            for (j in 0..< i) {
//                if (nums[])
//            }
//        }
    }
}