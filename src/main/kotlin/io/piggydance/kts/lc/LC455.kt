package io.piggydance.kts.lc

class LC455 {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        var i = 0
        s.forEach {
            if (i < g.size && it >= g[i]) {
                i++
            }
        }
        return i
    }
}