package io.piggydance.kts.interview

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MyCircularQueueTest {

    @Test
    fun `test basic cases`() {
        val queue = MyCircularQueue(3)
        Assertions.assertEquals(true, queue.enQueue(1))
        Assertions.assertEquals(true, queue.enQueue(2))
        Assertions.assertEquals(true, queue.enQueue(3))
        Assertions.assertEquals(false, queue.enQueue(4))

        Assertions.assertEquals(3, queue.Rear())
        Assertions.assertEquals(true, queue.isFull())
        Assertions.assertEquals(true, queue.deQueue())
        Assertions.assertEquals(true, queue.enQueue(4))

        Assertions.assertEquals(4, queue.Rear())
    }

}