package io.piggydance.kts.lc

class LC41 {
    fun firstMissingPositive(nums: IntArray): Int {
        nums.forEachIndexed { i, v ->
            while (nums[i] >= 1 && nums[i] <= nums.size && nums[i] != i+1 && nums[i] != nums[nums[i]-1]) {
                val tmp = nums[nums[i]-1]
                nums[nums[i]-1] = nums[i]
                nums[i] = tmp
            }
        }
        nums.forEachIndexed { i, v ->
            if (v != i+1) {
                return i+1
            }
        }
        return nums.size + 1
    }
}
