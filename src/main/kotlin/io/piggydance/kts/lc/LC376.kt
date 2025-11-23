package io.piggydance.kts.lc

import kotlin.math.max

class LC376 {
    fun wiggleMaxLength(nums: IntArray): Int {
        // dp
        // dp[i] 表示以第i个元素结尾的最长序列
        // if nums[i] > nums[i-1]
        // dpUp[i] = dpDown[i-1] + 1
        // dpDown[i] = dpDown[i-1]
        // if nums[i] < nums[i-1]
        // dpDown[i] = dpUp[i-1] + 1
        // dpUp[i] = dpUp[i-1]
        // if nums[i] == nums[i-1]
        // dpUp[i] = dpUp[i-1]
        // dpDown[i] = dpDown[i-1]
        // result:
        // max(dpUp[i], dpDown[i])
        val dpUp = IntArray(nums.size)
        val dpDown = IntArray(nums.size)
        for (i in 1..< nums.size) {
            if (nums[i] > nums[i-1]) {
                dpUp[i] = dpDown[i-1] + 1
                dpDown[i] = dpDown[i-1]
            } else if (nums[i] < nums[i-1]) {
                dpDown[i] = dpUp[i-1] + 1
                dpUp[i] = dpUp[i-1]
            } else {
                dpUp[i] = dpUp[i-1]
                dpDown[i] = dpDown[i-1]
            }
        }
        return max(dpDown[nums.size-1], dpUp[nums.size-1]) + 1
    }
}
