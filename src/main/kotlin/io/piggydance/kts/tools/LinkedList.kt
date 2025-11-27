package io.piggydance.kts.tools

import io.piggydance.kts.api.ListNode

/**
 * 链表工具类，提供各种链表操作方法
 */
object LinkedListUtils {
    
    /**
     * 根据整数数组创建链表
     * @param values 整数数组
     * @return 链表头节点
     */
    fun createLinkedList(values: IntArray): ListNode? {
        if (values.isEmpty()) return null
        
        val head = ListNode(values[0])
        var current = head
        
        for (i in 1 until values.size) {
            current.next = ListNode(values[i])
            current = current.next!!
        }
        
        return head
    }

    /**
     * 根据整数列表创建链表
     * @param values 整数列表
     * @return 链表头节点
     */
    fun createLinkedList(values: List<Int>): ListNode? {
        if (values.isEmpty()) return null
        
        val head = ListNode(values[0])
        var current = head
        
        for (i in 1 until values.size) {
            current.next = ListNode(values[i])
            current = current.next!!
        }
        
        return head
    }
    
    /**
     * 将链表转换为字符串表示
     * @param head 链表头节点
     * @return 链表的字符串表示，格式如 "1->2->3->null"
     */
    fun printLinkedList(head: ListNode?): String {
        val sb = StringBuilder()
        var current = head
        
        while (current != null) {
            sb.append(current.`val`)
            if (current.next != null) {
                sb.append("->")
            }
            current = current.next
        }
        sb.append("->null")
        
        return sb.toString()
    }
    
    /**
     * 打印链表
     * @param head 链表头节点
     */
    fun printlnLinkedList(head: ListNode?) {
        println(printLinkedList(head))
    }
    
    /**
     * 将链表转换为整数列表
     * @param head 链表头节点
     * @return 整数列表
     */
    fun toList(head: ListNode?): List<Int> {
        val result = mutableListOf<Int>()
        var current = head
        
        while (current != null) {
            result.add(current.`val`)
            current = current.next
        }
        
        return result
    }
    
    /**
     * 查找链表中的节点
     * @param head 链表头节点
     * @param value 要查找的值
     * @return 找到的节点，如果没有找到返回null
     */
    fun findNode(head: ListNode?, value: Int): ListNode? {
        var current = head
        
        while (current != null) {
            if (current.`val` == value) {
                return current
            }
            current = current.next
        }
        
        return null
    }
    
    /**
     * 获取链表长度
     * @param head 链表头节点
     * @return 链表长度
     */
    fun getLength(head: ListNode?): Int {
        var length = 0
        var current = head
        
        while (current != null) {
            length++
            current = current.next
        }
        
        return length
    }
    
    /**
     * 根据索引获取链表节点
     * @param head 链表头节点
     * @param index 索引（从0开始）
     * @return 索引位置的节点，如果索引无效返回null
     */
    fun getNodeAtIndex(head: ListNode?, index: Int): ListNode? {
        if (index < 0) return null
        
        var current = head
        var currentIndex = 0
        
        while (current != null && currentIndex < index) {
            current = current.next
            currentIndex++
        }
        
        return current
    }
    
    /**
     * 创建带环的链表（用于检测环等问题）
     * @param values 整数数组
     * @param pos 环的起始位置（-1表示无环）
     * @return 链表头节点
     */
    fun createLinkedListWithCycle(values: IntArray, pos: Int): ListNode? {
        val head = createLinkedList(values)
        if (pos == -1 || head == null) return head
        
        var cycleNode: ListNode? = null
        var tail = head
        var index = 0
        
        // 找到环的起始节点和尾节点
        while (tail?.next != null) {
            if (index == pos) {
                cycleNode = tail
            }
            tail = tail.next
            index++
        }
        
        // 如果pos是最后一个节点，也认为是环
        if (index == pos) {
            cycleNode = tail
        }
        
        // 连接尾节点到环的起始节点
        tail?.next = cycleNode
        
        return head
    }
}