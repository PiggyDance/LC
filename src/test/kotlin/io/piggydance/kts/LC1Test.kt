package io.piggydance.kts

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream
import kotlin.test.assertEquals

class LC1Test {

    private val solution = LC1()

    // 标准测试用例
    @Test
    fun `should return correct indices when there is a solution`() {
        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        val actual = solution.func(input, target)
        assertArrayEquals(expected, actual)
    }

    // 重复元素测试用例
    @Test
    fun `should return correct indices when there are duplicate elements`() {
        val input = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)
        val actual = solution.func(input, target)
        assertArrayEquals(expected, actual)
    }

    // 负数测试用例
    @Test
    fun `should return correct indices when there are negative numbers`() {
        val input = intArrayOf(-1, -2, -3, -4, -5)
        val target = -8
        val expected = intArrayOf(2, 4)
        val actual = solution.func(input, target)
        assertArrayEquals(expected, actual)
    }

    // 多对解测试用例（应返回第一对找到的）
    @Test
    fun `should return first found pair when multiple solutions exist`() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val target = 6
        val expected = intArrayOf(1, 3) // 1+5=6，应先找到这一对
        val actual = solution.func(input, target)
        assertArrayEquals(expected, actual)
    }

    // 空数组测试用例
    @Test
    fun `should return default when input array is empty`() {
        val input = intArrayOf()
        val target = 10
        val expected = intArrayOf(0, 0) // 这是原代码的默认返回值
        val actual = solution.func(input, target)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun `tow normal cases`() {
        val solution = LC1()
        assertEquals("0,1", solution.func(intArrayOf(2, 7, 11, 15), 9).joinToString(","))
        assertEquals("0,1", solution.func(intArrayOf(3, 3), 6).joinToString(","))
    }
}
