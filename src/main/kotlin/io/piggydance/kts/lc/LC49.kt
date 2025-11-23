package io.piggydance.kts.lc

class LC49 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        strs.forEach {
            val key = it.toCharArray().sorted().joinToString("")
            if (!map.contains(key)) {
                map[key] = mutableListOf()
            }
            map[key]?.add(it)
        }
        return map.values.toList()
    }
}
