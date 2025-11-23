package io.piggydance.kts.lc

class LC70 {
    fun climbStairs(n: Int): Int {
        val mem = IntArray(n + 1)
        mem[0] = 1
        mem[1] = 1
        for (i in 2..n) {
            mem[i] = mem[i-1] + mem[i-2]
        }
        return mem[n]
    }
}
