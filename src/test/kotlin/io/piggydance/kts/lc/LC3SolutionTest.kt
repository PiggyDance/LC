package io.piggydance.kts.lc

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LC3SolutionTest {
    @Test
    fun `test basic case`() {
        val s = LC3Solution()
        assertEquals(3, s.lengthOfLongestSubstring("abcabc"))
        assertEquals(1, s.lengthOfLongestSubstring("bbbbbb"))
        assertEquals(3, s.lengthOfLongestSubstring("pwwkew"))
    }
}