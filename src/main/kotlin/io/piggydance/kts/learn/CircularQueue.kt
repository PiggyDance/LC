package io.piggydance.kts.learn

class CircularQueue(val cap: Int) {
    val array = IntArray(cap)
    var front = 0
    var rear = 0

    fun Front(): Int {
        if (isEmpty()) {
            return -1
        }
        return array[front]
    }

    fun Rear(): Int {
        if (isEmpty()) {
            return -1
        }
        return array[(rear - 1 + cap) % cap]
    }

    fun enQueue(v: Int): Boolean {
        if (isFull()) {
            return false
        }
        array[rear] = v
        rear = (rear + 1) % cap
        return true
    }

    fun deQueue(): Boolean {
        if (isEmpty()) {
            return false
        }
        front = (front + 1) % cap
        return true
    }

    fun isEmpty(): Boolean {
        return rear == front
    }

    fun isFull(): Boolean {
        return (rear + 1) % cap == front
    }

    private fun size(): Int {
        return (rear - front + cap) % cap
    }

}