package io.piggydance.kts

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MyCircularQueueTest {

    @Test
    fun `test basic cases`() {
        val queue = MyCircularQueue(3)
        assertEquals(true, queue.enQueue(1))
        assertEquals(true, queue.enQueue(2))
        assertEquals(true, queue.enQueue(3))
        assertEquals(false, queue.enQueue(4))

        assertEquals(3, queue.Rear())
        assertEquals(true, queue.isFull())
        assertEquals(true, queue.deQueue())
        assertEquals(true, queue.enQueue(4))

        assertEquals(4, queue.Rear())
    }

}
