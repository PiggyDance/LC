package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC70Test {
    @Test
    fun `test basic case`() {
        val s = LC70()
        assertEquals(2, s.climbStairs(2))
        assertEquals(3, s.climbStairs(3))
        assertEquals(5, s.climbStairs(4))
    }
}