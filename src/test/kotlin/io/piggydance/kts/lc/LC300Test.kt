package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC300Test {
    @Test
    fun `test basic case`() {
        val s = LC300()
        assertEquals(4, s.lengthOfLIS(intArrayOf(10,9,2,5,3,7,101,18)))
        assertEquals(4, s.lengthOfLIS(intArrayOf(0,1,0,3,2,3)))
        assertEquals(1, s.lengthOfLIS(intArrayOf(7,7,7,7,7,7,7)))
    }

}