package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC376Test {
    @Test
    fun `test basic case`() {
        val solution = LC376()
        assertEquals(6, solution.wiggleMaxLength(intArrayOf(1,7,4,9,2,5)))
        assertEquals(7, solution.wiggleMaxLength(intArrayOf(1,17,5,10,13,15,10,5,16,8)))
        assertEquals(2, solution.wiggleMaxLength(intArrayOf(1,2,3,4,5,6,7,8,9)))
    }

    @Test
    fun `test conor case`() {
        val solution = LC376()
        assertEquals(1, solution.wiggleMaxLength(intArrayOf(1)))
        assertEquals(2, solution.wiggleMaxLength(intArrayOf(1, 3)))
        assertEquals(1, solution.wiggleMaxLength(intArrayOf(1, 1)))
        assertEquals(2, solution.wiggleMaxLength(intArrayOf(-1, 1)))
        assertEquals(2, solution.wiggleMaxLength(intArrayOf(1, 2, 3, 4, 5, 6)))
    }
}
