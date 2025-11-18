package io.piggydance.kts

class LC1 {
    fun func(input: IntArray, target: Int): IntArray {
        // 存储值到下标的映射
        val map = mutableMapOf<Int, Int>()
        input.forEachIndexed { i, v ->
            val aim = target - v
            if (map.containsKey(aim)) {
                return intArrayOf(map[aim] as Int, i)
            } else {
                map[v] = i
            }
        }
        return intArrayOf(0, 0)
    }
}
