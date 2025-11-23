package io.piggydance.kts.lc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LC49Test {
    @Test
    fun `test basic case`() {
        val solution = LC49()
        println(solution.groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
    }
}