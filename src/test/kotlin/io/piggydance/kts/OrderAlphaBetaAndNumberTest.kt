package io.piggydance.kts

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OrderAlphaBetaAndNumberTest {
    @Test
    fun `basic case`() {
        val input = "a1b2c3"
        val expected = "abc123"
        val actual = OrderAlphaBetaAndNumber().solve(input)
        assertEquals(expected, actual)
    }

    @Test
    fun `basic case2`() {
        val input = "fa1b2c3f"
        val expected = "abcf123"
        val actual = OrderAlphaBetaAndNumber().solve(input)
        assertEquals(expected, actual)
    }
}
