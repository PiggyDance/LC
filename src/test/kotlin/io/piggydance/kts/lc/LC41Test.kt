package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC41Test {

    @Test
    fun `test basic case`() {
        val s = LC41()
        assertEquals(3, s.firstMissingPositive(intArrayOf(1, 2, 0)))
        assertEquals(2, s.firstMissingPositive(intArrayOf(3, 4, -1, 1)))
        assertEquals(1, s.firstMissingPositive(intArrayOf(2, 2)))
        assertEquals(2, s.firstMissingPositive(intArrayOf(1, 1)))
    }

    @Test
    fun `test basic case 2`() {
        val s = LC41()
        assertEquals(3, s.firstMissingPositive2(intArrayOf(1, 2, 0)))
        assertEquals(2, s.firstMissingPositive2(intArrayOf(3, 4, -1, 1)))
        assertEquals(1, s.firstMissingPositive2(intArrayOf(2, 2)))
        assertEquals(2, s.firstMissingPositive2(intArrayOf(1, 1)))
        assertEquals(1, s.firstMissingPositive2(intArrayOf(2)))
    }
}