package io.piggydance.kts.interview

import kotlin.math.max

// 1,2,3,4,5
// 2,1,3,5,4
//

class Solution {
    fun solve(price: IntArray): Int {
        val minPriceEveryDay = IntArray(price.size)
        minPriceEveryDay[0] = price[0]
        for (i in 1 until price.size) {
            if (price[i] < minPriceEveryDay[i-1]) {
                minPriceEveryDay[i] = price[i]
            } else {
                minPriceEveryDay[i] = minPriceEveryDay[i-1]
            }
        }
        var result = 0
        for (i in 0 until price.size) {
            result = max(result, price[i] - minPriceEveryDay[i])
        }
        return result
    }
}

fun assertEquals(a: Int, b: Int) {
    if (a == b) {
        print("true")
    } else {
        print("false")
    }
}

fun main(args: Array<String>) {
    val s = Solution()
    assertEquals(4, s.solve(intArrayOf(1,2,3,4,5)))
    assertEquals(0, s.solve(intArrayOf(1)))
    assertEquals(0, s.solve(intArrayOf(5,4,3,2,1)))
}
