package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class LC455Test {
    @Test
    fun `basic case`() {
        val s = LC455()
        assertEquals(1, s.findContentChildren(intArrayOf(1,2,3), intArrayOf(1,1)))
        assertEquals(2, s.findContentChildren(intArrayOf(1,2), intArrayOf(1,2,3)))
        assertEquals(2, s.findContentChildren(intArrayOf(10,9,8,7), intArrayOf(5,6,7,8)))
    }
}
