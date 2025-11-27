package io.piggydance.kts.lc

import io.piggydance.kts.tools.LinkedListUtils
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC61Test {
    @Test
    fun `test basic case`() {
        val s = LC61()
        assertEquals(
            LinkedListUtils.toList(LinkedListUtils.createLinkedList(intArrayOf(4, 5, 1, 2, 3))),
            LinkedListUtils.toList(s.rotateRight(LinkedListUtils.createLinkedList(intArrayOf(1, 2, 3, 4, 5)), 2))
        )
        assertEquals(
            LinkedListUtils.toList(LinkedListUtils.createLinkedList(intArrayOf(2, 0,1))),
            LinkedListUtils.toList(s.rotateRight(LinkedListUtils.createLinkedList(intArrayOf(0,1,2)), 4))
        )
    }
}
