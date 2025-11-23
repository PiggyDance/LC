package io.piggydance.kts.lc

class LC118 {
    fun generate(numRows: Int): List<List<Int>> {
        // r[i] = result[curRow-1][
        val result = mutableListOf<List<Int>>()
        result.add(listOf(1))
        var curRow = 1
        while (curRow < numRows) {
            val r = mutableListOf<Int>()
            for (i in 0.. curRow) {
                r.add(if (i in 1..< curRow) result[curRow-1][i-1] + result[curRow-1][i] else 1)
            }
            result.add(r)
            curRow++
        }
        return result
    }
}
