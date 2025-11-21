package io.piggydance.kts.lc

import kotlin.math.max


// pwwkew 3
// abcabcbb 3
// bbbbb 1
class LC3Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var result = 0
        var left = 0
        var right = 0
        val set = mutableSetOf<Char>()
        val charS = s.toCharArray()

        while (left < s.length && right < s.length) {
            if (!set.contains(charS[right])) {
                set.add(charS[right++])
                result = max(result, right - left)
            } else {
                set.remove(charS[left++])
            }
        }

        return result
    }
}
