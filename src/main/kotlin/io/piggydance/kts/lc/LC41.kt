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

    fun firstMissingPositive2(numbers: IntArray): Int {
        val nums = IntArray(numbers.size + 1)
        numbers.copyInto(nums, 1)
        // 2, 1, 3, 5
        for (i in 1..< nums.size) {
            while (nums[i] >= 1 && nums[i] <= numbers.size && nums[i] != i && nums[i] != nums[nums[i]]) {
                val j = nums[i]
                val tmp = nums[j]
                nums[j] = nums[i]
                nums[i] = tmp
            }
        }
        for (i in 1..< nums.size) {
            if (nums[i] != i) {
                return i
            }
        }
        return nums.size
    }
}
