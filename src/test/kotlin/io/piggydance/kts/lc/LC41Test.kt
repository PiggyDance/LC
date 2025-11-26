package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC41Test {

    @Test
    fun `test basic case`() {
        val s = LC41()
        assertEquals(3, s.firstMissingPositive(intArrayOf(1, 2, 0)))
        assertEquals(2, s.firstMissingPositive(intArrayOf(3, 4, -1, 1)))
    }
}