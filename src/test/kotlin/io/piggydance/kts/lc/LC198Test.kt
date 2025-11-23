package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC198Test {
    @Test
    fun `test basic case`() {
        val s = LC198()
        assertEquals(12, s.rob(intArrayOf(2,7,9,3,1)))
        assertEquals(4, s.rob(intArrayOf(1,2,3,1)))
    }
}